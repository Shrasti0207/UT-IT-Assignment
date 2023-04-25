import com.typesafe.scalalogging.Logger

class PasswordChecker(userName: String, userEmail: String) {
  def checkPasswordStrength(userPassword: String): Boolean = {
    val hasUpper = userPassword.exists(character => character.isUpper)
    val hasLower = userPassword.exists(character => character.isLower)
    val hasAlphanumericCharacters = userPassword.exists(character => character.isLetterOrDigit)
    val hasSpecialCharacter = userPassword.exists(character => character == '%' || character == '@' ||
      character == '#' ||
      character == '&' ||
      character == '$')
    val userNameExist = !userPassword.contains(userName)

    if (hasUpper && hasLower && hasAlphanumericCharacters && hasSpecialCharacter && userNameExist){
      true
    } else {
      false
    }
  }
}
object PasswordCheckerDriver extends App{
  val logger = Logger(getClass)
  private val passwordChecker = new PasswordChecker("Shrasti0207", "abc@gmail.com")
  logger.info("password check:" + passwordChecker.checkPasswordStrength("Abc123"))
  logger.info("password check:" + passwordChecker.checkPasswordStrength("Abc@123"))
}
