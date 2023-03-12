enablePlugins(ScriptedPlugin)

ThisBuild / scalaVersion := "2.12.17"
ThisBuild / autoStartServer := false

name := "scala-seed"

addCommandAlias("test", "g8Test")

scriptedLaunchOpts ++= Seq(
  "-Xms1g",
  "-Xmx1g",
  "-XX:ReservedCodeCacheSize=128m",
  "-Xss2m",
  "-Dfile.encoding=UTF-8",
)
