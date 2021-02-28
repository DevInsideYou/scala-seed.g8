import sbt._

object Scalac {
  val Lint =
    Seq(
      "-Wdead-code",
      "-Wunused:_",
      "-Wvalue-discard",
      "-Xlint:_",
    )

  val FatalWarnings =
    Seq(
      "-Xfatal-warnings"
    )

  object Keys {
    val lint =
      settingKey[Seq[String]]("Decides weather to use lint related options.")

    val warnings =
      settingKey[Seq[String]]("Configures warnings.")

    val lintOn =
      settingKey[Boolean]("""By default: !sys.env.contains("LINT_OFF")""")

    val shouldLint =
      settingKey[Boolean]("By default: true inside ci unless lint is off.")
  }
}
