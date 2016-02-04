package models

import slick.driver.MySQLDriver.api._

case class Group(id: Int, name: String)
class Groups(tag: Tag) extends Table[Group](tag, "GROUP") {

  def id   = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def name = column[String]("NAME")

  def * = (id, name) <> (Group.tupled, Group.unapply)
}
