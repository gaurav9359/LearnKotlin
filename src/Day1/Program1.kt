package Program1

fun main(){
    println("I have started learning Kotlin")


    //variables
    //    val,var

    val name="gaurav"
//    name= "saurav" not allowed
    println(name)
    var name2="gaurav"
    name2="saurav"
    println(name2)


    //String Teamplate
    println("oreno nawa ${name2}")



    //Basic Data Types
    //Int,Float,Char,Double,Boolean,String
    var value1:Int=4
    var value2:Float= 4.23F
    var value3:Double=4.23
    var value4:Char='p'
    var value5:String="gaurav"

    println("$value1 $value2 $value3 $value4 $value5 are the values of data type")



    //collections
//    list,set,maps

    //list
//    mutable and nonmutable
    var nameOfFamily:List<String> = listOf("lion","tiger","cat")
    println("name of the family in list is: ${nameOfFamily}")

    print("firstIndex: ${nameOfFamily[0]} length: ${nameOfFamily.reversed()}")


    //Sets
    var setExample:MutableSet<Int> = mutableSetOf(3,4,5);
    setExample.add(7)
    setExample.add(0)
    if(setExample.contains(0)){
        setExample.remove(0)
    }
    println(setExample)


    //Maps
    var mapExample:MutableMap<String,Int> = mutableMapOf("gaurav" to 1, "saurav" to 2)

    println("map values: ${mapExample["gaurav"]}")


    //Functions

    fun sum(a:Int, b: Int):Int{
        return a+b;
    }
   println("result of running sum function: ${sum(4,5)}")


    //lambda funciton

    val lambdaFunction:(String,String)->String={p,q->
        val result=p + q
        result}
    println("printing the concatinaion of gaurav and pathak through lambda function -> ${lambdaFunction("gaurav","pathak")}")


    //user filter and map
    val Data:List<Int> = listOf(1,2,3,4,5,6,7)

    val filteredData=Data.map{x->x*2}
    val mappedData=Data.filter{x->x===2}


    println("mappedData -> ${mappedData} & filteredData-> ${filteredData}")

    //Class and objects
    class Contact(val id: Int, var email: String) {
        fun printId() {
            println(id)
        }
    }

    fun main() {
        val contact = Contact(1, "mary@gmail.com")
        // Calls member function printId()
        contact.printId()
        // 1
    }
}
