package controllers

import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.mvc._
import slick.driver.JdbcProfile

import models._

class Application extends Controller with HasDatabaseConfig[JdbcProfile] {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)
  import driver.api._

  val tokens = TableQuery[Tokens]
  val groups = TableQuery[Groups]
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
