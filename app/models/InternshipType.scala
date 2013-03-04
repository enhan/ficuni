package models

/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 04/03/13
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
case class InternshipType(id:Long, title:String)
object InternshipType{
  def all() : List[InternshipType] = Nil
  def create(title:String){}
  def delete(id:Long){}
}
