object NonogramRow {

  def checkRow(ns: Seq[Int]): Seq[Int] = ns.isEmpty match {
    case true => ns       // handle empty seq

    case _ => ns.
      map(_.toString).reduce(_ + _)   // convert seq ns to string
      .split("0+").           // split on 0s
      filter(_.nonEmpty).           // ensure 0s weren't at the beginning
      map(_.length)                // count 1s in each series
  }
}
