ThisBuild / scalaVersion := "2.12.12"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.1")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.13.1")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
