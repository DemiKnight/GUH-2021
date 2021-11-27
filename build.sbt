ThisBuild / scalaVersion := "2.13.7"
ThisBuild / name := "GUH-2021"
ThisBuild / version := "0.0.1"

val AkkaVersion = "2.6.17"
val AkkaHttpVersion = "10.2.7"

ThisBuild / libraryDependencies ++= Seq(
  // Akka
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,

  // JSON
  "de.heikoseeberger" %% "akka-http-json4s" % "1.38.2",
  "org.json4s" %% "json4s-native" % "4.0.2",

  // Logging / Utils
  "ch.qos.logback" % "logback-classic" % "1.2.5",
  "com.beachape" %% "enumeratum" % "1.7.0",
)