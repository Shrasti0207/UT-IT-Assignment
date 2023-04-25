import org.scalatest.funsuite.AnyFunSuite

class DuplicateElementsSpectTest extends AnyFunSuite{
  val duplicateElements = new DuplicateElements
  test("Test for Duplicate Integers of list"){
    val actual = duplicateElements.checkDuplicates(List(1, 3, 3, 4, 4, 6))
    val expected = true
    assert(actual === expected)
  }

  test("Test for non-duplicate string of list"){
    val actual = duplicateElements.checkDuplicates(List("Shrasti", "Gauri"))
    val expected = false
    assert(actual === expected)
  }
}