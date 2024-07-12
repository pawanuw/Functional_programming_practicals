object que_1 extends App {
    var itemNames = Array ("Rice","Dhal","Onion","Eggs")
    var itemQuantity = Array (15, 10, 8, 40)
    
    def displayInventory()={
        for (i <- 0 until 4) {
            if (itemQuantity(i) > 0)
                println(itemNames(i) + "-----" + itemQuantity(i))
        }
        println()
    }

    def restockItem(itemName:String, quantity:Int)={
        var done:Boolean = false
        for (i <- 0 until 4) {
            if (itemName == itemNames(i)) {
                itemQuantity(i) = itemQuantity(i) + quantity
                done = true
            }
        }
        if (done == false)
            println("No such item!")
    }
    
    def sellItem(itemName:String, quantity:Int)={
        var done:Boolean = false
        for (i <- 0 until 4) {
            if (itemName == itemNames(i)) {
                itemQuantity(i) = itemQuantity(i) - quantity
                done = true
            }
        }
        if (done == false)
            println("No such item!")
    }
    displayInventory()
    restockItem("Rice", 10)
    displayInventory()
    sellItem("Eggs",38)
    displayInventory()
}
