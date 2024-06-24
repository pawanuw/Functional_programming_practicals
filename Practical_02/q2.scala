object q2{
    def main(Args: Array[String])={
        var a=2
        var b=3
        var c=4
        var d=5
        var k=4.3f

        var g=4.0f

        b -= 1
        println(s"--b * a + c * d-- = ${b * a + c * d}")
        d -= 1
        println(s"a++ = ${a}")
        a += 1
        println(s"-2 * (g - k) + c = ${-2 * (g - k) + c}")
        println(c)
        c += 1
        c += 1
        println(c * a)
        a += 1
    }
}