object ques_3 extends App {
    def fibonacci(num:Int):Int = num match {
        case 0 => 0
        case x if (x == 1) => 1
        case _ => fibonacci(num - 1) + fibonacci(num - 2)
    }

    def fibonnaciS(n:Int):Unit={
        if (n>0) fibonnaciS(n-1)
        println(fibonacci(n))
    }

    print("Enter n: ")
    val num = scala.io.StdIn.readInt()
    fibonnaciS(num - 1)

}