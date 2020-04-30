class Student
{
    var name:String=""
    var marks:Int=0

    fun show() 
    {
        println(name)
        println(marks)
    } 
}

fun main (args:Array<String>)
{
    var s=Student()
    s.name= "Jaafar"
    s.marks=90
    s.show()
}