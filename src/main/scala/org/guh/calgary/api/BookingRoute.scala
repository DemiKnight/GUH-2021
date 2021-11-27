package org.guh.calgary.api
import akka.actor.typed.ActorRef
import akka.http.scaladsl.server.Route
import akka.http.scaladsl._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.server._
import akka.http.scaladsl.server.Directives._
import akka.util.Timeout
import org.guh.calgary.Main
import org.guh.calgary.models.Booking
import org.guh.calgary.services.BookingDB

import scala.concurrent.Future
import scala.concurrent.duration._

object BookingRoute extends RouteBase {
  import akka.actor.typed.scaladsl.AskPattern.schedulerFromActorSystem
  import akka.actor.typed.scaladsl.AskPattern.Askable


  override val route: Route = concat {
    put {
      entity(as[Booking]) { booking: Booking =>
        complete(s"$booking")
      }
    } ~
    pathSuffix(IntNumber) { number =>
      post {
        complete("xxx")
      } ~ get {
        complete("xx")
      }
    }
  }
}
