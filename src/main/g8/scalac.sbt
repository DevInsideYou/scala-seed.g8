import Scalac._
import Scalac.Keys._

ThisBuild / scalacOptions ++= Seq(
  "-language:_",
  "-Ymacro-annotations"
) ++ Seq("-encoding", "UTF-8") ++ warnings.value ++ lint.value

ThisBuild / warnings := {
  if (insideCI.value)
    Seq(
      "-Wconf:any:error", // for scalac warnings
      "-Xfatal-warnings" // for wartremover warts
    )
  else
    Seq(
      "-Wconf:any:warning"
    )
}

ThisBuild / lint := {
  if (shouldLint.value)
    Lint
  else
    Seq.empty
}

ThisBuild / shouldLint := {
  lazy val lintOn = !sys.env.contains("LINT_OFF")

  insideCI.value || lintOn
}

ThisBuild / wartremoverWarnings := {
  if (shouldLint.value)
    Warts.all
  else
    (ThisBuild / wartremoverWarnings).value
}
