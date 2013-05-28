package org.decaf.polynote
import java.io.File
import jsonz.{Reads, Writes}
import spray.routing.Directives
import spray.http.{HttpResponse, HttpBody, MediaTypes}
import spray.httpx.marshalling.Marshaller
import org.fusesource.scalate.TemplateEngine

abstract class BasicRoute extends Directives {
  type Route = spray.routing.Route
  def route: Route

  def template[T](path: String, attributes: Map[String, Any] = Map.empty) =
    complete(HttpResponse(entity = HttpBody(MediaTypes.`text/html`, Scalate(path, attributes))))

  implicit lazy val actorRefFactory = PolynoteActorSystem

  val PathUUID = JavaUUID
  val PathString = PathElement
  val StatusCodes = spray.http.StatusCodes

  def uuid = newUuid

  val StringUnmarshaller = spray.httpx.unmarshalling.BasicUnmarshallers.StringUnmarshaller

  implicit def writesMarshaller[T: Writes] = jsonz.spray.writesMarshaller[T]
  implicit def readsUnmarshaller[T: Reads] = jsonz.spray.readsUnmarshaller[T]
}

object Scalate {
  def apply(file: String, attributes: Map[String, Any]) = engine.layout(file, attributes)

  private[this] lazy val engine = new TemplateEngine(new File("./src/main/resources/templates/") :: Nil, "production")
}
