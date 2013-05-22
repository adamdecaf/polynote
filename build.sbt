name := "polynote"

organization := "org.decaf"

scalaVersion := "2.10.1"

version := "1.0-SNAPSHOT"

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io"
)

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.joda" % "joda-convert" % "1.1",
  "joda-time" % "joda-time" % "2.0",
  "io.spray" % "spray-can" % "1.1-M7",
  "io.spray" % "spray-client" % "1.1-M7",
  "io.spray" % "spray-routing" % "1.1-M7",
  "com.typesafe.akka" %% "akka-actor" % "2.1.4",
  "com.typesafe.akka" %% "akka-remote" % "2.1.4",
  "com.typesafe.akka" %% "akka-slf4j" % "2.1.4"
)

libraryDependencies ++= Seq(
  "io.spray" % "spray-testkit" % "1.1-M7" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.1.4"
)

publishArtifact in (Compile, packageSrc) := false

publishArtifact in (Compile, packageDoc) := false
