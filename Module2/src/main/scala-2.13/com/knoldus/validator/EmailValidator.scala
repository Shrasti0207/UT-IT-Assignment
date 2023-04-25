package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = {
    val regex = "(\\w+)(\\.|_)?(\\w*)@(\\w+)(\\.(\\w+))+".r
    regex.findFirstMatchIn(emailId) match{
      case Some(_) => true
      case None => false
    }
  }
}
object Main extends App{
  val emailValidator = new EmailValidator
  println(emailValidator.emailIdIsValid("he.she@.xyz"))
}
