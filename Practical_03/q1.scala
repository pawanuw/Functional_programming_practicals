object q1 extends App {
    def stringReversal(arr:Array[Char], size:Int):Unit={
        if (size == 0)
            return
        else {
            print(arr(size-1))
            stringReversal(arr,size-1)
        }
    }
    val word = scala.io.StdIn.readLine("Enter a word: ")
    var stringLength = word.length
    val stringArray = new Array[Char](stringLength)
    for (i <- 0 until stringLength) {
        stringArray(i)=word(i)
    }
    stringReversal(stringArray, stringLength)
}
