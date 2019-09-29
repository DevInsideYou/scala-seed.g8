ThisBuild / scalaVersion := "2.12.10"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.6")

addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt" % "0.6.1")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.2")
