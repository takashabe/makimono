package models

import slick.driver.MySQLDriver.api._

case class Member(id: Int, accountId: Int, groupId: Int, roomId: Int, name: String, image: String)
class Members(tag: Tag) extends Table[Member](tag, "MEMBER") {

  def id        = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def accountId = column[Int]("ACCOUNT_ID")
  def groupId   = column[Int]("GROUP_ID")
  def roomId    = column[Int]("ROOM_ID")
  def name      = column[String]("NAME")
  def image     = column[String]("IMAGE")

  def * = (id, accountId, groupId, roomId, name, image) <> (Member.tupled, Member.unapply)
}
