package org.guh.calgary.api

import akka.http.scaladsl._
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.server._
import akka.http.scaladsl.server.Directives._
import org.guh.calgary.api.sysadmin.SysadminBookingRoute


object Routes {

  val bookingRoute: Route = path("booking")(BookingRoute.route)
  val adminBookingRoute: Route = path("booking")(SysadminBookingRoute.route)

  val carRoute: Route = path("car")(CarRoute.route)
  val adminCarRoute: Route = path("car")(SysadminBookingRoute.route)

  val publicPaths: Route = pathPrefix("v1") {
    carRoute ~ bookingRoute
  }

  val adminPaths: Route = pathPrefix("sysadmin") {
    adminBookingRoute ~ adminCarRoute
  }

  val allRoutes = Seq(
    adminPaths,
    carRoute
  ).reduce((x, y) => x ~ y)
}


trait RouteBase {
  val route: Route
}