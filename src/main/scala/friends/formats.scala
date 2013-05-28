package org.decaf.polynote.friends
import jsonz._
import jsonz.DefaultFormats._
import org.decaf.polynote.BasicRoute

trait FriendFromats {
  this: BasicRoute =>

  implicit lazy val friendListFormat =
    productFormat1("friends")(FriendList.apply)(FriendList.unapply)
}
