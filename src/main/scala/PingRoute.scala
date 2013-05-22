package org.decaf.polynote

object PingRoute extends PingRoute

class PingRoute extends BasicRoute {
  def route =
    (get & path("ping")) {
      complete(StatusCodes.OK)
    }
}
