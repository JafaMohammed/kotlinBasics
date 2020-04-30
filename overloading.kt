//overloading is using a multiple function with the same name but diff parameters

class ABC
{
    fun sum(x:Int,y:Int)
    {
        println(x+y)
    }
    fun sum(x:Int,y:Int,z:Int)
    {
        println(x+y+z)
    }
}

fun main (args:Array<String>)
{
    var a=ABC()
    a.sum(x:2; y:5)
    a.sum(x:5; y:4,3)
}