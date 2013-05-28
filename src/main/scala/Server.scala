package org.decaf.polynote
import akka.actor.{Actor, Props}
import spray.routing.{ExceptionHandler, HttpServiceActor}
import spray.can.server.SprayCanHttpServerApp
import org.decaf.polynote.friends.FriendsRoute

object HttpServerActor {
  lazy val actor = PolynoteActorSystem.actorOf(Props(new HttpServiceActor with Actor {
    def receive = runRoute {
      PingRoute.route ~
      IndexRoute.route
      FriendsRoute.route
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
