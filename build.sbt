name := "scala-java-time"
organization := "com.github.kamijin-fanta"
version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.4"
// sbt "release cross"
crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

publishTo := sonatypePublishTo.value
publishMavenStyle := true
licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
