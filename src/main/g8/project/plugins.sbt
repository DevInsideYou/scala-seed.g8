ThisBuild / autoStartServer := false

// The std library for sbt is handled by sbt itself so no need to include it in the report.
dependencyUpdatesFilter -= moduleFilter(name = "scala-library")

update / evictionWarningOptions := EvictionWarningOptions.empty

addDependencyTreePlugin

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.12.1")
addSbtPlugin("com.mayreh" % "sbt-thank-you-stars" % "0.2")
addSbtPlugin("com.timushev.sbt" % "sbt-rewarn" % "0.1.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.10.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "3.2.0")
