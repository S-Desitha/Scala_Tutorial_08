object DepositToInterest {
  val calculateInterest: Int => Double = deposit => {
    if (deposit <= 20000) deposit * 0.02
    else if (deposit <= 200000) deposit * 0.04
    else if (deposit <= 2000000) deposit * 0.035
    else deposit * 0.065
  }

  def main(args: Array[String]): Unit = {
    val deposit = 50000
    val totalInterest = calculateInterest(deposit)
    println(s"Total Interest for the deposit of ${deposit} is $totalInterest")
  }
}
