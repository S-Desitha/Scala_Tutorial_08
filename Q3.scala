object StringFormatting {
  def main(args: Array[String]): Unit = {
    val names = List(
      ("Benny", Seq(0,1,2,3,4), Seq()),
      ("Niroshan", Seq(0, 1), Seq(2, 3, 5, 6)),
      ("Saman", Seq(), Seq(0,1,2,3,4)),
      ("Kumara", Seq(0,5), Seq(1,2,3,4))
    )

    val formatName: (String, Seq[Int], Seq[Int]) => String = (str, upperIndexes, lowerIndexes) => {
      val formattedChars = str.zipWithIndex.map { case (char, index) =>
        if (upperIndexes.contains(index)) char.toUpper
        else if (lowerIndexes.contains(index)) char.toLower
        else char
      }
      formattedChars.mkString
    }

    names.foreach { nameTuple =>
      val name = nameTuple._1
      val upperIndexes = nameTuple._2
      val lowerIndexes = nameTuple._3

      val formattedName = formatName(name, upperIndexes, lowerIndexes)
      println(formattedName)
    }
  }
}
