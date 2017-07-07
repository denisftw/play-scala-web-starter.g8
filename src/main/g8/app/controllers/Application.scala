package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class Application @Inject() (components: ControllerComponents)
    extends AbstractController(components) {
  def index = Action {
    Ok(views.html.index())
  }
}
