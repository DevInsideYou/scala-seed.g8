import Dependencies._

ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.0.1-SNAPSHOT"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(name := "$name$")
    .settings(commonSettings)
    .settings(dependencies)

lazy val commonSettings = Seq(
  addCompilerPlugin(org.augustjune.`context-applied`),
  addCompilerPlugin(org.typelevel.`kind-projector`),
  update / evictionWarningOptions := EvictionWarningOptions.empty,
  Compile / console / scalacOptions := {
    (Compile / console / scalacOptions)
      .value
      .filterNot(_.contains("wartremover"))
      .filterNot(Scalac.Lint.toSet)
      .filterNot(Scalac.FatalWarnings.toSet) :+ "-Wconf:any:silent"
  },
  Test / console / scalacOptions :=
    (Compile / console / scalacOptions).value
)

lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    // main dependencies
  ),
  libraryDependencies ++= Seq(
    com.github.alexarchambault.`scalacheck-shapeless_1.14`,
    org.scalacheck.scalacheck,
    org.scalatest.scalatest,
    org.scalatestplus.`scalacheck-1-14`,
    org.typelevel.`discipline-scalatest`
  ).map(_ % Test)
)
