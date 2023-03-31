package $package;format="lower,package"$
package $name;format="lower,word"$

// Put all of your arbitraries in here
// For data structures defined in your tests (like Person actually)
// you can also use the @derive(arbitrary) annotation
trait Arbitraries {
  implicit protected val arbitraryPerson: Arbitrary[Person] =
    arbitrary.instance
}
