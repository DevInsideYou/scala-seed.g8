ThisBuild / scalaVersion := "2.12.10"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt" % "0.6.1")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.2.1")
