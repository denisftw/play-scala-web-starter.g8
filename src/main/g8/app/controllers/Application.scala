package controllers

import controllers.Assets.Asset
import javax.inject._
import play.api.mvc._

class Application @Inject() (components: ControllerComponents, assets: Assets)
    extends AbstractController(components) {
  def index = Action {
    Ok(views.html.index())
  }

  def versioned(path: String, file: Asset) = assets.versioned(path, file)
}
