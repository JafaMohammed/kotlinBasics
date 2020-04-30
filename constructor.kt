class Employee
{
    var name:String=""
    var bg:String=""

    constructor()
    {
        bg="O"
    }
}


fun main (args:Array<String>)
{
    var emp=Employee()
    emp.name= "Jaafar"
    println(emp.name)
    println(emp.bg)
}