package org.decaf.polynote.friends
import org.decaf.polynote.BasicRoute

object FriendsRoute extends FriendsRoute

trait FriendsRoute extends BasicRoute with FriendFromats {

  def route =
    (get & viewFriendsPath) { userId =>
      complete(makeStubbedFriendsList())
    } ~
    (post & addFriendPath) { (userId, friendId) =>
      complete(StatusCodes.OK)
    } ~
    (delete & deleteFriendPath) { (userId, friendId) =>
      complete(StatusCodes.OK)
    }

  private[this] val viewFriendsPath = path("users" / PathUUID / "friends")
  private[this] val addFriendPath = path("users" / PathUUID / "friends" / PathUUID)
  private[this] val deleteFriendPath = path("users" / PathUUID / "friends" / PathUUID)

  def makeStubbedFriendsList() =
    FriendList(List(uuid, uuid, uuid))
}
