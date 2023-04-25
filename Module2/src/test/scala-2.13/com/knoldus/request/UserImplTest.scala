package kup.knoldus.utit.com.knoldus.request
import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import org.scalatest.funsuite.AnyFunSuite

class UserImplTest extends AnyFunSuite {
  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  test("Test for valid emailId"){
    val user = User("Shrasti", "Gupta", 21, 22000.0, "developer","Knoldus", "shrasti@knoldus.com")
    val actual = userImpl.createUser(user)
    val expected = Some(user.emailId)
    assert(actual === expected)
  }
  test("Test when the company name is not present ") {
    val user = User("Mansi", "Gupta", 21, 22000.0, "developer", "Capgemini", "mansi@capgemini.com")
    val actual = userImpl.createUser(user)
    val expected = None
    assert(actual === expected)
  }

  test("Test when the emailid is not valid") {
    val user = User("sakshi", "Gupta", 22, 22000.0, "developer", "Knoldus", "sakshi.adeptia.com")
    val actual = userImpl.createUser(user)
    val expected = None
    assert(actual === expected)
  }
}
