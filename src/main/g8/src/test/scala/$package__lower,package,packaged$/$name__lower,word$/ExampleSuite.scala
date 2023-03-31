package $package;format="lower,package"$
package $name;format="lower,word"$

// The annotation is not required since an arbitrary instance is already derived inside of
// the Arbitraries trait which is mixed into TestSuite. It is left here only for demonstration purposes.

// @derive(arbitrary)
final case class Person(name: String, age: Int)

final class ExampleSuite extends TestSuite {
  test("hello world") {
    forAll { (person: Person) =>
      expectEquals(person, person)
      expectEquals(person.name, person.name)
      expectEquals(person.age, person.age)
    }
  }
}
