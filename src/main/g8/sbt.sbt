import Build._

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / autoStartServer := false
ThisBuild / turbo := true
ThisBuild / useSuperShell := false
ThisBuild / includePluginResolvers := true

ThisBuild / shellPrompt := { state =>
  val project =
    Project
      .extract(state)
      .currentRef
      .project

  s"sbt:\${styled(project)}> "
}

ThisBuild / watchStartMessage := {
  case (iteration, ProjectRef(build, project), commands) =>
    Some {
      s"""|~\${commands.map(styled).mkString(";")}
    |Monitoring source files for \${styled(project)}...""".stripMargin
    }
}

ThisBuild / watchBeforeCommand := Watch.clearScreen
ThisBuild / watchTriggeredMessage := Watch.clearScreenOnTrigger
ThisBuild / watchForceTriggerOnAnyChange := true

Test / parallelExecution := false
Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oSD")
