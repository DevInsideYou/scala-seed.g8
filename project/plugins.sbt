ThisBuild / autoStartServer := false

update / evictionWarningOptions := EvictionWarningOptions.empty

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.2")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
