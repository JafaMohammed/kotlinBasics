fun main (args:Array<String>)
{
    //static arrays
    var bloodGroup = arrayOf ("A","B","O", "AB")
    for (x in bloodGroup)
    println(x)

    println(bloodGroup[2])

    //dynamic arrays
    var books=ArrayList<String>()
    books.add("Harry Potter and the Chamber of Secrets")
    books.add("Harry Potter and the Goblet of Fire")
    for (y in books)
    println(y)


    //hashmap arrays
    var emp = HashMap<String,Int>()
    emp.put("John", 1000)
    emp.put("Ali", 5000)

    for (z in emp.keys)
    {
        println(z)
        println(emp[z])
    }
}