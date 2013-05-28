package org.decaf.polynote

object IndexRoute extends IndexRoute

trait IndexRoute extends BasicRoute {

  def route =
    (get & rootPath) {
      redirect("/index")
    } ~
    (get & indexPath) {
      template("/templates/logged-out.jade")
    }

  private[this] val rootPath = path("")
  private[this] val indexPath = path("index")
}
