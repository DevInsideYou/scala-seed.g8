import Dependencies._

ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:_",
  "-unchecked",
  "-Wunused:_",
  "-Xfatal-warnings",
  "-Ymacro-annotations"
)

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(
      name := "$name$",
      addCompilerPlugin(org.typelevel.`kind-projector`),
      libraryDependencies ++= Seq(
        // main dependencies
      ),
      libraryDependencies ++= Seq(
        com.github.alexarchambault.`scalacheck-shapeless_1.14`,
        org.scalacheck.scalacheck,
        org.scalatest.scalatest,
        org.scalatestplus.`scalacheck-1-14`
      ).map(_ % Test),
      Compile / console / scalacOptions --= Seq(
        "-Wunused:_",
        "-Xfatal-warnings"
      ),
      Test / console / scalacOptions :=
        (Compile / console / scalacOptions).value
    )
