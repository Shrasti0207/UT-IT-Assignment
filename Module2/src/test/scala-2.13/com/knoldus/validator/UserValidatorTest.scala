package kup.knoldus.utit.com.knoldus.validator
import com.knoldus.validator.UserValidator
import com.knoldus.models.User
import org.scalatest.funsuite.AnyFunSuite

class UserValidatorTest extends  AnyFunSuite {
  val userValidator = new UserValidator

  test("Test when company name exist and valid emailId"){
    val user = User("Shrasti", "gupta", 21, 22000.0, "developer", "Knoldus", "shrasti@knoldus.com")
    assert(userValidator.userIsValid(user) === true)
  }

  test("Test when company name does not exist but valid emailId") {
    val user = User("Mansi", "Gupta", 22, 22000.0, "developer", "Capgemini", "shrasti@capgemini.com")
    assert(userValidator.userIsValid(user) === false)
  }

  test("Test when company name exist but invalid emailId") {
    val user = User("Shivani", "Gupta", 22, 22000.0, "developer", "Knoldus", "shrasti.knoldus.com")
    assert(userValidator.userIsValid(user) === false)
  }

}
