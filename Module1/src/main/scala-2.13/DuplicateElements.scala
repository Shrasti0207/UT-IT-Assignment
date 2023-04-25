import com.typesafe.scalalogging.Logger

class DuplicateElements extends App{
  def checkDuplicates[T](inputList: List[T]): Boolean = {
    inputList.distinct.size != inputList.size
  }
}

object DuplicateElementsDriver extends App{
  val logger = Logger(getClass)
  val duplicateElements = new DuplicateElements
  logger.info("Check duplicate elements :" +duplicateElements.checkDuplicates(List(1,2,3,2,5)))
}
