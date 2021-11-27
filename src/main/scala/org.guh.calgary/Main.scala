package org.guh.calgary

import akka.NotUsed
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorSystem, Behavior}
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import scala.concurrent.{ExecutionContextExecutor, Future}
import scala.io.StdIn

object Config {
  final val host = "localhost"
  final val port = 8081
}

object Main extends App {
  implicit val actorSystem: ActorSystem[NotUsed] = ActorSystem(Behaviors.empty, "GUH")
  implicit val exContext: ExecutionContextExecutor = actorSystem.executionContext

  val routes: Route = path("test") {
    get {
      complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h2>GUH</h2>"))
    }
  }

  val binding: Future[Http.ServerBinding] = Http()
    .newServerAt(Config.host, Config.port)
    .bind(routes)

  println(s"Server now online. Please navigate to http://${Config.host}:${Config.port}/test\nPress RETURN to stop...")
  StdIn.readLine() // let it run until user presses return
  binding
    .flatMap(_.unbind()) // trigger unbinding from the port
    .onComplete(_ => actorSystem.terminate()) // and shutdown when done
}
