import org.scalatest._
import org.scalatest.funsuite._
import org.scalatestplus.scalacheck._

trait TestSuite
    extends AnyFunSuite
    with Matchers
    with BeforeAndAfterAll
    with BeforeAndAfterEach
    with ScalaCheckPropertyChecks {
  final protected type Assertion = compatible.Assertion
}
