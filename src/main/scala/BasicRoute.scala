package org.decaf.polynote
import spray.routing.Directives

abstract class BasicRoute extends Directives {
  type Route = spray.routing.Route
  def route: Route

  lazy val StatusCodes = spray.http.StatusCodes
}
