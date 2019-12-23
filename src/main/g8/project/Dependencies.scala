import sbt._

object Dependencies {
  case object com {
    case object github {
      case object alexarchambault {
        val `scalacheck-shapeless_1.14` = "com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.3"
      }
    }
  }

  case object org {
    case object scalacheck {
      val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.3"
    }

    case object scalatest {
      val scalatest = "org.scalatest" %% "scalatest" % "3.0.8"
    }

    case object typelevel {
      val `kind-projector` = "org.typelevel" %% "kind-projector" % "0.10.3"
    }
  }
}
