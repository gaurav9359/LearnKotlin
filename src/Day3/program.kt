package Day3

import com.sun.jdi.connect.Connector.StringArgument

fun main(){
//    val name:List<String> =listOf("gaurav","saurav")
//
//    name.forEach { x ->
//        print(x)
//    }

//    for((names,index) in name.withIndex()){
//        println("${names} at ${index}")
//    }


//    //it will take range
//    for(i in 1..4){
//        println(i)
//    }

////    input
//    var namaiva= readln()
//    println("Your name is ${namaiva}")


    //when

//    //when as switch
//    var name:String= readln()
//    when(name){
//        "gaurav"-> print("your name is Gaurav")
//        "saurav"-> print("your name is Saurav")
//        "Abhinav"-> print("your name is Abhinav")
//        else-> print("nothing matches the list")
//    }

//    //when as expression
//    var name:String= readln().lowercase()
//    var surname:String=when(name!!){
//        "gaurav"->"pathak"         //we can also use multipule input like "gaurav","pranav","yashnav"->"pathak"
//        "saurav"->"ganguly"
//        "abhinav"->"bindra"
//        else -> "not pathak family member"
//    }
//
//    println("your full name is ${name} ${surname}")

////    we can also check the type with when
//    var name= readln()
//    var nameIsString=when(name){
//        is String-> {
//            name.startsWith("gau")          //we cannot use return inside this functions
//        }
//        else -> false
//    }
//
//    print("if name starts with gau True else False : ${nameIsString}")


//    // continue and unlabelled break
//    var i=0;
//    while(i<9){
//        if(i==5){
//            println("value is 5 hence exiting")
//            break
//        }
//
//        if(i==2){
//            i++
//            continue
//
//        }
//        println(i)
//        i++;
//    }

//    //labelled break
//    var i=0
//    var j=0
//    outer@ while(i<9){
//        inner@ while(j<5){
//            print(j)
//            j++
//            if(j==2) {
//                i++; continue@outer
//            }
//        }
//        println()
//        i++
//    }


//    //Array
//    var name= arrayOf(1,2,3)
//    name.forEach({ind-> print(ind) })  //we can use get and set in array


    //Strings
//    var name:String="gaurav"
//    print(name[2])


//    //Functions
//    fun name(firstName:String,lastName:String):Unit{  //unit type is used if we don't want to return anything
//        print("oreno")
//    }

////    default and Named argument
////    Named-> (name:String,age:Int)    |    Default-> (name:String="gaurav",age:Int=13)

//    lamda expression
//    var sum:(Int,Int)->Int= { a, b -> 2 + 3 } note if we want to use only single parameter then we can access it using it
//    ex->
//    var print_num:(Int)->Int={
//        it
//    }
//
//    print(print_num(2))


    //higher order function
    // regular function definition
    fun add(a: Int, b: Int): Int{
        var sum = a + b
        return sum
    }
    // higher-order function definition
    fun higherfunc(addfunc:(Int,Int)-> Int){
        // invoke regular function using local name
        var result = addfunc(3,6)
        print("The sum of two numbers is: $result")
    }

        higherfunc(::add)   //-> note that passing function inside function require ::

}

