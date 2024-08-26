object q1_q2_q3 {
  
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(num => num % 2 == 0)
    }

    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(num => num * num)
    }

    def isPrime(num: Int): Boolean = {
        if (num <= 1) false
        else if (num == 2) true
        else !(2 until num).exists(i => num % i == 0)
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(num => isPrime(num))
    }
    
    def main(args: Array[String]): Unit = {
        val input1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val input2 = List(1, 2, 3, 4, 5)
        val output1 = filterEvenNumbers(input1)
        val output2 = calculateSquare(input2)
        val output3 = filterPrime(input1)
        println(output1) 
        println(output2) 
        println(output3) 
    }
}
