open class ABC
{
    fun show()
    {
        println("Hello from parent")
    }
}
class XYZ:ABC()
{
    fun display()
    {
 println("Hello from child")
    }   
}

fun main (args:Array<String>)
{
    var x =XYZ()
    x.show()
    x.display()
}