package org.decaf

import java.util.UUID
import akka.actor.ActorSystem
import org.joda.time.DateTime
import com.typesafe.config.ConfigFactory
import scala.concurrent.ExecutionContext

package object polynote {
  lazy val PolynoteConfig = ConfigFactory.load()
  implicit lazy val PolynoteActorSystem: ActorSystem = ActorSystem("polynote")
  implicit lazy val PolynoteExecutionContext: ExecutionContext = PolynoteActorSystem.dispatcher

  def now: DateTime = new DateTime
  def newUuid: String = UUID.randomUUID.toString
}
