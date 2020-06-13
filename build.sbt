organization := "everyogi.in"

name := "99-scala"

version := "0.1"

scalaVersion := "2.12.6"

lazy val p01 = project
lazy val p02 = project

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2" % "test"

dependsOn(p01)
dependsOn(p02)