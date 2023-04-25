import org.scalatest.funsuite.AnyFunSuite
class PasswordCheckerSpecTest extends AnyFunSuite {
  val passwordChecker = new PasswordChecker("Shrasti0207", "shrasti@gmail.com")
  test("Test for valid password "){
    val actual = passwordChecker.checkPasswordStrength("Abc@123")
    val expected = true
    assert(actual === expected)
  }
  test("Test case for valid password if it does not contain uppercase and lower case"){
    val actual = passwordChecker.checkPasswordStrength("12345")
    val expected = false
    assert(actual === false)
  }
  test("Testing for valid password if it doesn't contain special character and digit"){
    val actual = passwordChecker.checkPasswordStrength("Abcde")
    val expected = false
    assert(actual === expected)
  }
  test("Test case for password if it contains username"){
    val actual = passwordChecker.checkPasswordStrength("AShrasti0207@12")
    val expected = false
    assert(actual === expected)
  }
  test("Test case for password if it contains only space"){
    val actual = passwordChecker.checkPasswordStrength("  ")
    val expected = false
    assert(actual === expected)
  }
}