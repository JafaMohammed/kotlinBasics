fun main(args: Array<String>)
{  
    println("Enter number")
    var x:Int= readLine()!!.toInt()

when  (x)
{
    1 ->println("A")
    2 ->println("B")
    in 3..5 ->println("C")
    else -> println("D")
}
   
}