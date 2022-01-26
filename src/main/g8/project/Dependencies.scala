import sbt._

object Dependencies {
  object com {
    object github {
      object alexarchambault {
        val `scalacheck-shapeless_1.15` =
          "com.github.alexarchambault" %% "scalacheck-shapeless_1.15" % "1.3.0"
      }

      object liancheng {
        val `organize-imports` =
          "com.github.liancheng" %% "organize-imports" % "0.6.0"
      }
    }

    object olegpy {
      val `better-monadic-for` =
        "com.olegpy" %% "better-monadic-for" % "0.3.1"
    }
  }

  object org {
    object augustjune {
      val `context-applied` =
        "org.augustjune" %% "context-applied" % "0.1.4"
    }

    object scalacheck {
      val scalacheck =
        "org.scalacheck" %% "scalacheck" % "1.15.4"
    }

    object scalatest {
      val scalatest =
        "org.scalatest" %% "scalatest" % "3.2.11"
    }

    object scalatestplus {
      val `scalacheck-1-15` =
        "org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0"
    }

    object typelevel {
      val `discipline-scalatest` =
        "org.typelevel" %% "discipline-scalatest" % "2.1.5"

      val `kind-projector` =
        "org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full
    }
  }
}
