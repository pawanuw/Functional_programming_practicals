object q_9_1 extends App {
    def func_A():={
        
    }
    def function_decider(depo_amount:Double):Int = depo_amount match {
        case x if x < 0 => 0
        case x if x < 20000 => 1
        case x if x < 200000 => 2
        case x if x < 2000000 => 3
        case _ => 4
    }
    def interest(depo_amount:Double,):Double = {
        
    }
}