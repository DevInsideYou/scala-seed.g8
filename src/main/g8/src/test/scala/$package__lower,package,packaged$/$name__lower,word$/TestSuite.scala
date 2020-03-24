package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalacheck.ScalacheckShapeless

import org.scalatest._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should

import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

trait TestSuite
    extends AnyFunSuite
    with should.Matchers
    with BeforeAndAfterAll
    with BeforeAndAfterEach
    with ScalaCheckPropertyChecks
    with ScalacheckShapeless {
  final protected type Assertion =
    org.scalatest.compatible.Assertion
}

