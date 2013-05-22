package org.decaf.polynote
import akka.actor.{Actor, Props}
import spray.routing.HttpServiceActor
import spray.can.server.SprayCanHttpServerApp

object HttpServerActor {
  lazy val actor = PolynoteActorSystem.actorOf(Props(new Actor with HttpServiceActor {
    def receive = runRoute {
      PingRoute.route
    }
  }))
}

object Server extends App with SprayCanHttpServerApp {
  override lazy val system = PolynoteActorSystem

  startHttpServer()

  private[this] def startHttpServer() {
    newHttpServer(HttpServerActor.actor) ! Bind(PolynoteConfig.getString("http.host"),
                                                PolynoteConfig.getInt("http.port"))
  }
}
