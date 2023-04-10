package $package;format="lower,package"$
package $name;format="lower,word"$

import scala.Console._

import com.eed3si9n.expecty.Expecty
import munit.internal.console.StackTraces.dropInside

trait Expectations {
  this: munit.FunSuite =>
  def expect(
    cond: Boolean
  )(implicit
    loc: munit.Location
  ): Unit =
    macro Macro.expectWithoutClue

  def expect(
    cond: Boolean,
    clue: => Any,
  )(implicit
    loc: munit.Location
  ): Unit =
    macro Macro.expectWithClue

  def expectEquals[A, B](
    obtained: A,
    expected: B,
    clue: => Any = "values are not the same",
  )(implicit
    loc: munit.Location,
    ev: B <:< A,
  ): Unit = {
    lazy val calculatedClue = {
      val expectyClue =
        try {
          val expect = Expecty.assert

          expect(obtained == expected)

          ""
        }
        catch Macro.ExtractMessage

      if (expectyClue.isEmpty) s"\$RED\n\$clue\$RESET"
      else s"\$RED\n\$clue\n\$expectyClue\$RESET"
    }

    assertEquals(obtained, expected, calculatedClue)
  }

  def expectNotEquals[A, B](
    obtained: A,
    expected: B,
    clue: => Any = "values are the same",
  )(implicit
    loc: munit.Location,
    ev: A =:= B,
  ): Unit = {
    lazy val calculatedClue = {
      val expectyClue =
        try {
          val expect = Expecty.assert

          expect(obtained != expected)

          ""
        }
        catch Macro.ExtractMessage

      val clueWithSuffix =
        s"\${munitPrint(clue)} expected same: \$expected was not: \$obtained"

      if (expectyClue.isEmpty) clueWithSuffix
      else s"\$RED\n\$clueWithSuffix\n\$expectyClue\$RESET"
    }

    dropInside(if (obtained == expected) failComparison(calculatedClue, obtained, expected))
  }
}
