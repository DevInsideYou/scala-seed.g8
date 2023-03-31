package $package;format="lower,package"$
package $name;format="lower,word"$

import scala.Console._
import scala.reflect.macros.blackbox.Context

import com.eed3si9n.expecty.Expecty

object Macro {
  def expectWithoutClue(
    c: Context
  )(
    cond: c.Expr[Boolean]
  )(
    loc: c.Expr[munit.Location]
  ): c.Expr[Unit] = {
    import c.universe._

    reify {
      lazy val calculatedClue =
        getClue(
          originalClue = "assertion failed",
          expectyClue =
            try { Expecty.assert(cond.splice); "" }
            catch ExtractMessage,
        )

      munit.Assertions.assert(cond.splice, calculatedClue)(loc.splice)
    }
  }

  def expectWithClue(
    c: Context
  )(
    cond: c.Expr[Boolean],
    clue: c.Expr[Any],
  )(
    loc: c.Expr[munit.Location]
  ): c.Expr[Unit] = {
    import c.universe._

    reify {
      lazy val calculatedClue =
        getClue(
          originalClue = clue.splice,
          expectyClue =
            try { Expecty.assert(cond.splice); "" }
            catch ExtractMessage,
        )

      munit.Assertions.assert(cond.splice, calculatedClue)(loc.splice)
    }
  }

  val ExtractMessage: PartialFunction[Throwable, String] = {
    case e: AssertionError =>
      // It's in a try/catch because getMessage and split might be null and
      // Int.MaxValue will be converted to length.
      try e.getMessage.split("\n").slice(2, Int.MaxValue).mkString("\n", "\n", "\n")
      catch { case scala.util.control.NonFatal(_) => "" }
  }

  protected def getClue(originalClue: Any, expectyClue: String): String =
    if (expectyClue.isEmpty) s"\$RED\n\$originalClue\$RESET"
    else s"\$RED\n\$originalClue\n\$expectyClue\$RESET"
}
