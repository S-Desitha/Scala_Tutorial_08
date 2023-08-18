import scala.io.StdIn

object PatternMatchingLambda {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = StdIn.readInt()

    val classifyNumber: Int => String = {
      case x if x <= 0 => "Negative/Zero is given"
      case x if x % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    val result = classifyNumber(input)
    println(result)
  }
}
