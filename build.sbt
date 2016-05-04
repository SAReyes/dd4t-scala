name := """dd4tScala"""

lazy val commonSettings = Seq(
  organization := "org.example",
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val dd4tScala = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(dd4tPlayApplication, dd4tLibrary)

lazy val dd4tPlayApplication = (project in file("dd4tPlayApplication"))
  .enablePlugins(PlayScala)
  .settings(commonSettings: _*)
  .dependsOn(dd4tLibrary)

lazy val dd4tLibrary = (project in file("dd4tLibrary"))
  .settings(commonSettings: _*)

run in Compile <<= (run in Compile in dd4tPlayApplication)
