ThisBuild / scalaVersion := "2.12.10"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.1")
