ThisBuild / scalaVersion := "2.12.15"
ThisBuild / autoStartServer := false

update / evictionWarningOptions := EvictionWarningOptions.empty

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.0")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.13.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.3")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
