import com.typesafe.scalalogging.Logger
import scala.annotation.tailrec
import scala.util.Try

class Factorial {
  def findFactorial(inputNumber: Int): Try[Int] = {
    if (inputNumber < 0){
      Try(throw new IllegalArgumentException("Can't negative"))
    }
    else{
      def helper(inputNumber: Int, accumulator: Int): Int = {
        if (inputNumber == 0) {
          accumulator
        }
        else {
          helper(inputNumber - 1, accumulator * inputNumber)
        }
      }
      Try(helper(inputNumber, 1))
    }
  }
}
object FactorialDriver extends App{
  val logger = Logger(getClass)
  val factorial = new Factorial
  logger.info("Factorial of the number : " + factorial.findFactorial(3))
  logger.info("Factorial of the number : " + factorial.findFactorial(-2))
}
