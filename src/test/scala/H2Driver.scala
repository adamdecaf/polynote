package org.decaf.polynote

import org.squeryl.Session
import java.sql.DriverManager
import org.squeryl.adapters.{H2Adapter, PostgreSqlAdapter}
import org.squeryl.PrimitiveTypeMode._

trait H2Config extends PostgresConfig {
  val server   = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1"
  val username = "SA"
  val password = ""
}

trait H2SessionManager extends H2Config {
  Class.forName("org.h2.Driver")
  Session.create(getConnection(), new PostgreSqlAdapter)

  private[this] def getConnection() =
    DriverManager.getConnection(server, username, password)
}

trait H2DBDriver extends H2SessionManager
  { //with UserTables {
  def populateData(): Unit

  def initDb() = inTransaction {
    // (new UserPostgresMigrations with H2Config).migrate()
  }
}
