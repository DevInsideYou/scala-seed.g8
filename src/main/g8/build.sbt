ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.0.1-SNAPSHOT"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(
      name := "$name$",
      addCompilerPlugin(Dependencies.CompilerPlugins.`kind-projector`),
      libraryDependencies ++= Seq(
        Dependencies.Test.`scalacheck-shapeless_1.14` % Test,
        Dependencies.Test.scalacheck % Test,
        Dependencies.Test.scalatest % Test
      ),
      Compile / console / scalacOptions --= Seq(
        "-Wunused:_",
        "-Xfatal-warnings"
      ),
      Test / console / scalacOptions :=
        (Compile / console / scalacOptions).value
    )

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:_",
  "-Wunused:_",
  "-Xfatal-warnings",
  "-Ymacro-annotations"
)

lazy val cctt: String =
  "compile->compile;test->test"
