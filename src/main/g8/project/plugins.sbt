ThisBuild / autoStartServer := false

// The std library for sbt is handled by sbt itself so no need to include it in the report.
dependencyUpdatesFilter -= moduleFilter(name = "scala-library")

update / evictionWarningOptions := EvictionWarningOptions.empty

addDependencyTreePlugin

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.9")
addSbtPlugin("com.mayreh" % "sbt-thank-you-stars" % "0.2")
addSbtPlugin("com.timushev.sbt" % "sbt-rewarn" % "0.2.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.7.0")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.10.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.6.2")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "3.6.1")
