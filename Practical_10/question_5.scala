object question_10_5 extends App {

  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalLetterCount = wordLengths.reduce(_ + _)
    totalLetterCount
  }

  val words = List("hello", "world", "Scala", "rocks")
  val totalLetters = countLetterOccurrences(words)

  println(s"Total number of letters in the list: $totalLetters")
}
