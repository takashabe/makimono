package models

import slick.driver.MySQLDriver.api._

case class Token(id: Int, token: String)
class Tokens(tag: Tag) extends Table[Token](tag, "TOKEN") {

  def id    = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def token = column[String]("TOKEN")

  def * = (id, token) <> (Token.tupled, Token.unapply)
}
