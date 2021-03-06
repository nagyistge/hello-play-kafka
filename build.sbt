name := "hello-play-kafka"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka" % "0.13",
  "com.github.jkutner" % "env-keystore" % "0.1.2"
)

cancelable in Global := true
