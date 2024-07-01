import scala.io.StdIn.readLine

object q4 extends App {
    val totNumString = readLine("Enter the no. of numbers you want to enter: ")
    val totNum = totNumString.toInt
    val numArrayString = new Array[String](totNum)

    for (i <- 0 until totNum) {
        print("Enter an integer: ")
        numArrayString(i) = readLine()
    }
    val numArray = new Array[Int](totNum)
    for (i <- 0 until totNum) {
        numArray(i) = numArrayString(i).toInt
    }
    
    var sumEven:Int = 0
    for (i <- 0 until totNum) {
        if ((numArray(i) % 2) == 0)
            sumEven = sumEven + numArray(i)
    }

    println(s"Sum of even nums of the list= $sumEven")
}