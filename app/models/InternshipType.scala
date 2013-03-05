package models

import play.api.db.DB
import anorm._
import anorm.SqlParser._
import play.api.Play.current

/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 04/03/13
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
case class InternshipType(id:Long, title:String, description:String)
object InternshipType{
  def all() : List[Map[String, String]] = DB.withConnection {implicit c => SQL("select * from internship_type").as(internshipTypeJson *)}


  def create(title:String, description:String){
    DB.withConnection { implicit c => SQL("insert into internship_type (title, description) values ({title},{description})").
      on('title -> title, 'description -> description).executeInsert()
    }
  }
  def delete(id:Long){}

  val internshipTypeJson = {
    get[Long]("id") ~
    get[String]("title")~
    get[String]("description") map{
      case id~title~description => Map("id" -> id.toString, "title" -> title, "description"->description)
    }
  }

}
