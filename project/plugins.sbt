ThisBuild / scalaVersion := "2.12.13"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

update / evictionWarningOptions := EvictionWarningOptions.empty

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.2")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.13.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
