package org.guh.calgary.api

import akka.http.scaladsl._
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.server._
import akka.http.scaladsl.server.Directives._


object Routes {

  val bookingRoute: Route = ???
  val carRoute: Route = ???

  val allRoutes = Seq(
    bookingRoute,
    carRoute
  ).reduce((x, y) => x ~ y)
}
