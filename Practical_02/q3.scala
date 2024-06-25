object q3{
    def main(Args: Array[String])={
        val workingHours = 40
        val otHours = 30
        val taxRate = 12

        val totPay = payForWorkingHours(workingHours) + payForOTHours(otHours)
        val tax = calcTax(taxRate, totPay)
        val netPay = totPay - tax
        println(s"Take home salary = $netPay")
    }

    def payForWorkingHours(workingHours:Int):Double={
        workingHours * 250
    }

    def payForOTHours(otHours:Int):Double={
        otHours * 85
    }

    def calcTax(taxRate:Double, totPay:Double):Double={
        (taxRate * totPay) * 0.01
    }
}