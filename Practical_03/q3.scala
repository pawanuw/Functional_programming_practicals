import scala.io.StdIn.readLine

object q3 extends App {
    val num1String = readLine("Enter first num: ")
    val num2String = readLine("Enter second num: ")
    val num1 = num1String.toFloat
    val num2 = num2String.toFloat

    val ans:Float = (num1 + num2)/2
    println(f"Mean = $ans%.2f")
}
