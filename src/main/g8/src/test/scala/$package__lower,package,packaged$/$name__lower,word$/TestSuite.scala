package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalacheck.ScalacheckShapeless
import org.scalatest._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import org.typelevel.discipline.scalatest.FunSuiteDiscipline
import org.{ scalacheck => sc }

trait TestSuite
    extends AnyFunSuite
       with should.Matchers
       with GivenWhenThen
       with BeforeAndAfterAll
       with BeforeAndAfterEach
       with ScalaCheckPropertyChecks
       with ScalacheckShapeless
       with FunSuiteDiscipline {
  final protected type Arbitrary[A] =
    sc.Arbitrary[A]

  final protected val Arbitrary: sc.Arbitrary.type =
    sc.Arbitrary

  final protected type Assertion =
    org.scalatest.compatible.Assertion

  final protected type Gen[+A] =
    sc.Gen[A]

  final protected val Gen: sc.Gen.type =
    sc.Gen
}
