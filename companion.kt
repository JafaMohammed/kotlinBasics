class ABC
{
    var x :Int=0
    companion object{
        var y:Int=0
    }
}

fun main (args:Array<String>)
{
    var a =ABC()
    a.x++
    println(a.x)
    var b = ABC()
    b.x++
    println(b.x)
    ABC.y++
    ABC.y++
    println(ABC.y)
    
}