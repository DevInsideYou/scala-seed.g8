import Util._

Global / onChangedBuildSource := ReloadOnSourceChanges

Test / parallelExecution := false
Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oSD")

ThisBuild / autoStartServer := false
ThisBuild / turbo := true
ThisBuild / useSuperShell := false
ThisBuild / includePluginResolvers := true

ThisBuild / watchBeforeCommand := Watch.clearScreen
ThisBuild / watchTriggeredMessage := Watch.clearScreenOnTrigger
ThisBuild / watchForceTriggerOnAnyChange := true

ThisBuild / shellPrompt := { state =>
  s"\${prompt(projectName(state))}> "
}

ThisBuild / watchStartMessage := {
  case (iteration, ProjectRef(build, projectName), commands) =>
    Some {
      s"""|~\${commands.map(styled).mkString(";")}
          |Monitoring source files for \${prompt(projectName)}...""".stripMargin
    }
}
