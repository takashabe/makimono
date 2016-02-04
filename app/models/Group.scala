package models

import slick.driver.MySQLDriver.api._

case class Faction(id: Int, name: String)
class Factions(tag: Tag) extends Table[Faction](tag, "FACTION") {

  def id   = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def name = column[String]("NAME")

  def * = (id, name) <> (Faction.tupled, Faction.unapply)
}
