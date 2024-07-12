object que_2 extends App {
    def patternMatching(num:Int):String={
        num match {
            case num if num==0 => "Zero"
            case num if num < 0 => "Negative"
            case num if num%2 == 0 => "Even number"
            case num if num%2 == 1 => "Odd number"
            case _ => "Error"
        }
    }
    var num:Int = scala.io.StdIn.readInt()
    val result:String = patternMatching(num)
    println(result)
}
