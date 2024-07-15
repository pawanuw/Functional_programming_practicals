object ques_1 extends App {
    var products = List[String] ()
    var product:String = ""
    var num = 0
    def getProductList(product:String):Any={
        products = products :+ product
        num = num + 1
    }

    def printProductList():Any={
        println()
        println("Here is the items you entered:")
        for (item <- products) {
            println(item)
        }
    }

    def getTotalProducts(num:Int)={
        println(s"There are $num products in the list.")
    }

    var check:Boolean = true
    while (check) {
        product = scala.io.StdIn.readLine("Enter a product(to terminate, enter 'done'): ")
        if (product != "done") {
            getProductList(product)
        }
        else 
            check = false
    }
    printProductList()
    getTotalProducts(num)
}