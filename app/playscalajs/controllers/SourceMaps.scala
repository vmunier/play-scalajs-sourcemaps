package playscalajs.controllers

import play.api.Play.current
import play.api._
import play.api.libs.iteratee.Enumerator
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global

object SourceMaps extends Controller {

  val EnabledConfigKey = "playscalajs.sourcemaps.enabled"
  lazy val enabled = {
    val b = current.configuration.getBoolean(EnabledConfigKey).getOrElse(Play.isDev(current))
    Logger.debug(s"SourceMaps is enabled: $b")
    b
  }

  def scalaFile(unusedPath: String) = Action { request =>
    Play.resourceAsStream(request.path) match {
      case Some(streamedFile) if enabled =>
        Ok.chunked(Enumerator.fromStream(streamedFile))
      case _ =>
        NotFound(s"File ${request.path} not found")
    }
  }
}
