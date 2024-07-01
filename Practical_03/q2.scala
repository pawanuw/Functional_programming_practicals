import scala.io.StdIn.readLine

object q2 extends App {
    val totStringsAsString = readLine("Enter no. of strings you want to enter: ")
    val totStrings:Int = totStringsAsString.toInt
    val stringArray = new Array[String](totStrings)
    println("Enter a list of strings: ")
    for (i <- 0 until totStrings) {
        stringArray(i) = readLine()
    }
    println("")
    
    var matchment:Int = 0
    for (i <- 0 until totStrings) {
        var strLength = stringArray(i).length
        if (strLength > 5) {
            matchment = matchment + 1
            if (matchment == 1)
                println("Here is a list of strings which have more than 5 characters. ")
            println(stringArray(i))
        }
    }
    if (matchment == 0)
        println("There are no any strings having more than 5 characters. ")
}