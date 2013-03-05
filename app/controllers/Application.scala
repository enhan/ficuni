package controllers

import play.api.mvc._
import play.api.libs.json._
import models.InternshipType

object Application extends Controller {

  implicit object InternshipTypeJson extends Writes[InternshipType]{
    def writes(o: InternshipType): JsValue =  Json.toJson(Map("id" -> o.id.toString, "title" -> o.title, "description"-> o.description))
  }

  def internships = Action {
    Ok(Json.toJson(InternshipType.all()))
  }

  def newInternship = Action(parse.json){
    request => {
      val name = (request.body \ "title").as[String]
      val description =(request.body \ "description").as[String]
      println(name)
      println(description)
      InternshipType.create(name, description)
      Ok
    }
  }

}

