import org.scalatest.funsuite.AnyFunSuite
class FactorialSpecTest extends AnyFunSuite {
  val factorial = new Factorial
  test("Test For Positive Integer"){
    val actual = factorial.findFactorial(5)
    assert(actual.isSuccess === true)
    assert(actual.get === 120)
  }

  test("Test For zero Integer") {
    val actual = factorial.findFactorial(0)
    assert(actual.isSuccess === true)
    assert(actual.get === 1)
  }

  test("Test For negative Integer") {
    val actual = factorial.findFactorial(-2)
    assert(actual.isFailure === true)
  }
}