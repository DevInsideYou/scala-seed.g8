import sbt._

object Dependencies {
  object Test {
    val `scalacheck-shapeless_1.14` =
      "com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.3"

    val scalacheck =
      "org.scalacheck" %% "scalacheck" % "1.14.2"

    val scalatest =
      "org.scalatest" %% "scalatest" % "3.0.8"
  }

  object CompilerPlugins {
    val `kind-projector` =
      "org.typelevel" %% "kind-projector" % "0.10.3"
  }
}
