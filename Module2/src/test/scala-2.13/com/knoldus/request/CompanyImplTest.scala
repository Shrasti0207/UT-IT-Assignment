package kup.knoldus.utit.com.knoldus.request
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.scalatest.funsuite.AnyFunSuite

class CompanyImplTest extends AnyFunSuite {
  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  test("Test for valid company name"){
    val company = Company("Adeptia", "shrasti@adeptia.com", "Noida")
    val actual = companyImpl.createCompany(company)
    val expected = Some(company.name)
    assert(actual === expected)
  }

  test("Test if the company present in database"){
    val company = Company("Knoldus", "mansi@knoldus.com", "Delhi")
    val actual = companyImpl.createCompany(company)
    val expected = None
    assert(actual === expected)
  }

  test("Test if emailid is invalid"){
    val company = Company("Capgemini", "preeti.capgemini.com", "Gurgaon")
    val actual = companyImpl.createCompany(company)
    val expected = None
    assert(actual === expected)
  }
}
