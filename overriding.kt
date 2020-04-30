//two fxns of saame name and parameter but in different classes. 
//You cnnot use override without inheritance
open class A
{
    open fun show()
    {
        println("A")
    }
}
class B:A()
{
    override fun show()
    {
 println("B")
    }   
}

fun main (args:Array<String>)
{
    var a =A()
    a.show()
    var b = B()
    b.show()
    
}