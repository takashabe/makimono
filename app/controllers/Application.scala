package controllers

import javax.inject._

import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import play.api.mvc._
import play.db.NamedDatabase
import slick.driver.JdbcProfile
import play.api.Play.current
import play.Logger
import play.api.Play.current
import play.api.libs.ws._
import play.api.libs.ws.ning.NingAsyncHttpClientConfigBuilder
import scala.concurrent._
import scala.concurrent.duration.{ Duration, MILLISECONDS }

import models._

class Application @Inject()(dbConfigProvider: DatabaseConfigProvider) extends Controller {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile]
  import dbConfig._
  import driver.api._

  val tokens = TableQuery[Tokens]
  val factions = TableQuery[Factions]
  val member = TableQuery[Members]

  def index = Action {
    // slickのスニペット
//    val query = sql"SELECT * FROM token".as[(Int, String)]
//    val res = db.run(query)
//    val query2 = DBIO.seq (
//      sqlu"INSERT INTO token (token) VALUES ('query2_1')",
//      sqlu"INSERT INTO token (token) VALUES ('query2_2')"
//    )
//    val res2 = db.run(query2)

    // WSのスニペット
//    val token = "2c231b0d38135b026ee48bbe66515d88"
//    val feature = WS.url("https://api.chatwork.com/v1/me")
//      .withHeaders("X-ChatWorkToken" -> token)
//      .get()
//
//    val res = Await.result(feature, Duration(5000, MILLISECONDS))
//    Logger.debug(res.body)

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
