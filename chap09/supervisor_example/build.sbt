name := "SupervisorExample"

organization := "scalainaction"

version := "0.3"

scalaVersion := "2.10.0"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += ("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.1.0"
)

