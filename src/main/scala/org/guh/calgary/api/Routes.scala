package org.guh.calgary.api

import akka.http.scaladsl._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.server._
import akka.http.scaladsl.server.Directives._
import org.guh.calgary.api.sysadmin.SysadminBookingRoute


object Routes {
  val bookingRoute: Route = path("booking")(BookingRoute.route)
  val adminBookingRoute: Route = path("booking")(SysadminBookingRoute.route)

  val carRoute: Route = path("car")(CarRoute.route)
  val adminCarRoute: Route = path("car")(SysadminBookingRoute.route)

  val allRoutes = concat(
    pathPrefix("v1") {
      carRoute ~ bookingRoute
    },
    pathPrefix("sysadmin") {
      adminBookingRoute ~ adminCarRoute
    }
  )
}


trait RouteBase {
  val route: Route = pathEnd {
    get {
      complete(StatusCodes.NotImplemented, "Not Implemented")
    } ~
    post {
      complete(StatusCodes.NotImplemented, "Not Implemented")
    } ~ put {
      complete(StatusCodes.NotImplemented, "Not Implemented")
    } ~ delete {
      complete(StatusCodes.NotImplemented, "Not Implemented")
    }

  }
}