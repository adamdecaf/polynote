name := "polynote"

organization := "org.decaf"

//scalaVersion := "2.10.1"

scalaVersion := "2.9.3"

version := "1.0-SNAPSHOT"

scalacOptions += "-Ydependent-method-types"

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "jsonz" % "jsonz_2.9.1" % "0.3-SNAPSHOT",
  "joda-time" % "joda-time" % "2.0",
  "org.joda" % "joda-convert" % "1.1",
  "redis.clients" % "jedis" % "2.1.0",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.squeryl" % "squeryl_2.9.2" % "0.9.5-6",
  "io.spray" % "spray-can" % "1.0-M7",
  "io.spray" % "spray-client" % "1.0-M7",
  "io.spray" % "spray-routing" % "1.0-M7",
  // "com.typesafe.akka" %% "akka-actor" % "2.0.4",
  // "com.typesafe.akka" %% "akka-remote" % "2.0.4",
  // "com.typesafe.akka" %% "akka-slf4j" % "2.0.4",
  "com.typesafe.akka" % "akka-actor" % "2.0.1",
  "com.typesafe.akka" % "akka-remote" % "2.0.1",
  "com.typesafe.akka" % "akka-slf4j" % "2.0.1",
  "postgresql" % "postgresql" % "8.4-701.jdbc4",
  "org.fusesource.scalate" % "scalate-core" % "1.5.3"
)

libraryDependencies ++= Seq(
  //"org.specs2" %% "specs2" % "1.14" % "test",
  "org.specs2" %% "specs2" % "1.12.4.1" % "test",
  "com.h2database" % "h2" % "1.3.171" % "test",
  //"com.typesafe.akka" %% "akka-testkit" % "2.1.4",
  "io.spray" % "spray-testkit" % "1.0-M7" % "test"
)

publishArtifact in (Compile, packageSrc) := false

publishArtifact in (Compile, packageDoc) := false
