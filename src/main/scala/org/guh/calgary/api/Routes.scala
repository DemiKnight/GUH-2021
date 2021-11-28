package org.guh.calgary.api

import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.http.scaladsl._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.server._
import akka.http.scaladsl.server.Directives._
import akka.util.Timeout
import org.guh.calgary.api.sysadmin.SysadminBookingRoute
import de.heikoseeberger.akkahttpjson4s.Json4sSupport
import enumeratum.Json4s
import org.guh.calgary.Main
import org.guh.calgary.models.CarStatus
import org.json4s.Formats
import org.json4s.ext.JavaTimeSerializers
import org.slf4j.Logger

import scala.concurrent.duration.DurationInt

object Routes {
  val bookingRoute: Route = path("booking")(BookingRoute.route)
  val adminBookingRoute: Route = path("booking")(SysadminBookingRoute.route)

  val carRoute: Route = path("car")(CarRoute.route)
  val adminCarRoute: Route = path("car")(SysadminBookingRoute.route)

  val allRoutes = concat(
    pathPrefix("v1") {
      logRequest("V1 thingy") {
        carRoute ~ bookingRoute
      }
    },
    pathPrefix("sysadmin") {
      adminBookingRoute ~ adminCarRoute
    }
  )
}


trait RouteBase extends Json4sSupport {
  import org.json4s.native.Serialization
  import org.json4s.{DefaultFormats, Serialization}

  implicit val formats: Formats = DefaultFormats ++ JavaTimeSerializers.all + Json4s.serializer(CarStatus)
  implicit val serialisation: Serialization = Serialization
  implicit val actorSystem: ActorSystem[NotUsed] = Main.actorSystem
  implicit val timeout: Timeout = 3.seconds


  val route: Route = pathEnd {
    get (complete(StatusCodes.NotImplemented, "Not Implemented")) ~
    post (complete(StatusCodes.NotImplemented, "Not Implemented")) ~
    put (complete(StatusCodes.NotImplemented, "Not Implemented")) ~
    delete (complete(StatusCodes.NotImplemented, "Not Implemented"))
  }
}