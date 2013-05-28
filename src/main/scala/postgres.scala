package org.decaf.polynote
import scala.io.Source
import java.sql.DriverManager
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.{Session, SessionFactory}
import org.squeryl.adapters.PostgreSqlAdapter

trait PostgresConfig {
  def server: String
  def username: String
  def password: String
}

trait PostgresSessionManager {
  this: PostgresConfig =>

  Class.forName("org.postgresql.Driver")

  def session = Session.create(getConnection(), new PostgreSqlAdapter)

  private[this] def getConnection() =
    DriverManager.getConnection(server, username, password)
}

trait PostgresDBDriver extends PostgresSessionManager {
  this: PostgresConfig =>

  def session: Session
  def performTransaction[A](block: => A): A =
    if (Session.hasCurrentSession) {
      inTransaction(block)
    } else {
      transaction(session)(block)
    }
}

trait PostgresSchemaMigrations extends PostgresDBDriver {
  this: PostgresConfig =>

  private[this] def statement = Session.currentSession.connection.createStatement()

  // Fill in the run's here
  def migrate(): Unit

  protected def run(path: String) = performTransaction {
    val sql = readFile(path)
    try {
      statement.execute(sql)
    } catch {
      case e: Throwable => println(e); throw e;
    } finally {
      statement.close()
    }
  }

  private[this] def readFile(path: String): String = {
    val fullPath = getClass().getResource(path).toURI
    //log.info("Getting the full path for a migration: %s".format(fullPath))
    Source.fromFile(fullPath).getLines.mkString("\n")
  }
}
