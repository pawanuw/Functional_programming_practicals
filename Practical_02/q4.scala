object globalVar {
    val costPerAttendee = 3
    val costPerPerformance = 500
}

object q4 {
    def bestTicketPriceCalc(ticketPrice:Double, people:Int):Double={
        var profit1 = (ticketPrice * people) - (people * globalVar.costPerAttendee)
        var profit2 = (ticketPrice - 5) * (people + 20) - ((people + 20) * globalVar.costPerAttendee)
        var profit3 = (ticketPrice + 5) * (people - 20) - ((people - 20) * globalVar.costPerAttendee)
        if ((profit1 > profit2) && (profit3 > profit1)) {
            bestTicketPriceCalc(ticketPrice + 10, people - 40)
        }
        else if ((profit1 < profit2) && (profit3 < profit1)) {
            bestTicketPriceCalc(ticketPrice - 10, people + 40)
        }
        else if (profit1 == profit2) {
            return ticketPrice
        }
        else if (profit1 == profit3) {
            return ticketPrice + 5
        }
        else if (profit1 > profit2 && profit1 > profit3) {
            return ticketPrice
        }
        else {
            println("Error!")
            return 0
        }
    }

    def main(Args: Array[String])={
        val bestValue =  bestTicketPriceCalc(15, 120)
        println(s"Best value for ticket = $bestValue")
    }
}