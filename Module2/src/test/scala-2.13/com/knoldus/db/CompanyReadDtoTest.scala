package kup.knoldus.utit.com.knoldus.db
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import org.scalatest.funsuite.AnyFunSuite

class CompanyReadDtoTest extends AnyFunSuite {
  val companyReadDto = new CompanyReadDto
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = Company("Philips", "philips123@gmail.com", "Noida")

  test("Test for Knoldus Company Details"){
    val actual = companyReadDto.getCompanyByName("Knoldus")
    val expected = Some(knoldusCompany)
    assert(actual === expected)
  }

  test("Test for Philips Company Details"){
    val actual = companyReadDto.getCompanyByName("Philips")
    val expected = Some(philipsCompany)
    assert(actual === expected)
  }

  test("Test for invalid Company"){
    val actual = companyReadDto.getCompanyByName("adeptia")
    val expected = None
    assert(actual === expected)
  }

  test("Test for empty company Name"){
    val actual = companyReadDto.getCompanyByName(" ")
    val expected = None
    assert(actual === expected)
  }
}
