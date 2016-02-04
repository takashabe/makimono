package controllers

import javax.inject._

import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import play.api.mvc._
import play.db.NamedDatabase
import slick.driver.JdbcProfile
import play.api.Play.current

import models._

class Application @Inject()(dbConfigProvider: DatabaseConfigProvider) extends Controller {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile]
  import dbConfig._
  import driver.api._

  val tokens = TableQuery[Tokens]
  val factions = TableQuery[Factions]
  val member = TableQuery[Members]

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  /**
    * APIトークンを登録する
    */
  def postToken = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  /**
    * グループ一覧を返す
    */
  def getGroup = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  /**
    * 任意のグループ詳細を返す
    *
    * @param id グループID
    */
  def getGroupDetail(id: Int) = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  /**
    * グループを作る
    */
  def postGroupCreate = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  /**
    * 任意のグループに対してメッセージを送信する
    *
    * @param id グループID
    */
  def postGroupMessage(id: Int) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
}
