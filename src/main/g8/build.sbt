ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.0.1-SNAPSHOT"

import Dependencies._

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(
      name := "$name$",
      addCompilerPlugin(org.typelevel.`kind-projector`),
      libraryDependencies ++= Seq(
        com.github.alexarchambault.`scalacheck-shapeless_1.14`,
        org.scalacheck.scalacheck,
        org.scalatest.scalatest,
      ).map(_ % Test),
      dependencyOverrides ++= Seq(
        org.scalatest.scalatest
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
  "-unchecked",
  "-Wunused:_",
  "-Xfatal-warnings",
  "-Ymacro-annotations"
)

lazy val cctt: String =
  "compile->compile;test->test"
