package org.guh.calgary

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorSystem, Behavior}
import akka.http.scaladsl.Http
import org.guh.calgary.api.Routes

import scala.concurrent.{ExecutionContextExecutor, Future}
import scala.io.StdIn

object Config {
  final val host = "localhost"
  final val port = 8081
}

object Core {
  sealed trait CoreCMD
  final case object Start extends CoreCMD

  def apply(): Behavior[CoreCMD] = Behaviors.setup { context =>

    Behaviors.receiveMessage {
      case Start =>

        Behaviors.same
    }
  }

}

object Main extends App {
  implicit val actorSystem: ActorSystem[Core.CoreCMD] = ActorSystem[Core.CoreCMD](Core(), "GUH")
  implicit val exContext: ExecutionContextExecutor = actorSystem.executionContext

  val binding: Future[Http.ServerBinding] = Http()
    .newServerAt(Config.host, Config.port)
    .bind(Routes.allRoutes)

  println(s"Server now online. Please navigate to http://${Config.host}:${Config.port}\nPress RETURN to stop...")
  StdIn.readLine() // let it run until user presses return
  binding
    .flatMap(_.unbind()) // trigger unbinding from the port
    .onComplete(_ => actorSystem.terminate()) // and shutdown when done
}
