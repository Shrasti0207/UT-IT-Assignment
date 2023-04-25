package kup.knoldus.utit.com.knoldus.validator
import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator

class CompanyValidatorTest extends AnyFunSuite {
  val companyValidator = new CompanyValidator
  test("Test if company does not exist and have valid emailId"){
    val newCompany = Company("adeptia", "shrasti@adeptia.com", "noida")
    assert(companyValidator.companyIsValid(newCompany) === true)
  }

  test("Test if company exists in the database"){
    val newCompany = Company("Knoldus", "shrasti@knoldus.com", "Delhi")
    assert(companyValidator.companyIsValid(newCompany) === false)
  }

  test("Test if company does not exist in the database but invalid emailId") {
    val newCompany = Company("Capgemini", "shrasti.apgemini.com", "Delhi")
    assert(companyValidator.companyIsValid(newCompany) === false)
  }
}
