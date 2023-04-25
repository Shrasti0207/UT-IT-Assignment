package kup.knoldus.utit.com.knoldus.validator
import com.knoldus.validator.EmailValidator
import org.scalatest.funsuite.AnyFunSuite

class EmailValidatorTest extends AnyFunSuite {
  val emailValidator = new EmailValidator
  test("Test for valid emailId"){
    val email = "shrasti@knoldus.com"
    assert(emailValidator.emailIdIsValid(email) === true)
  }
  test("Test for invalid emailId"){
    val email = "shrasti.knoldus.com"
    assert(emailValidator.emailIdIsValid(email) === false)
  }
}
