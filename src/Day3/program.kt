package Day3

import com.sun.jdi.connect.Connector.StringArgument


////for companion object example
//class name(var namaiva:String="gaurav"){
//    companion object{
//        var naming:String="oreno"
//    }
//}

//for delegate functions
interface SoundBehavior {                                                          // 1
    fun makeSound()
}

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


//    //higher order function
//    // regular function definition
//    fun add(a: Int, b: Int): Int{
//        var sum = a + b
//        return sum
//    }
//    // higher-order function definition
//    fun higherfunc(addfunc:(Int,Int)-> Int){
//        // invoke regular function using local name
//        var result = addfunc(3,6)
//        print("The sum of two numbers is: $result")
//    }
//
//        higherfunc(::add)   //-> note that passing function inside function require ::

//    //let keyword
//    var stringList:List<String?> = listOf("roger",null,"name")
//
//    for(stringl in stringList){
//        stringl?.also{println(stringl.uppercase())}
//    }



        // Regex to match a 3 letter pattern beginning with ab
//        val pattern2 = Regex("ab.")
//        val ans1 : Sequence<MatchResult> = pattern2.findAll("abcfffgdbabs", 0)
//        // forEach loop used to display all the matches
//        ans1.forEach()
//        {
//                matchResult -> println(matchResult.value)
//        }
//        println()


//        class namaiva(name:String){
//
//                var name:String
//
//                init {
//                    this.name= name
//                }
//        }
//
//        var gaurav= namaiva("oreno nawa gaurav")
//        println()
//
//        println(if(gaurav.name=="oreno nawa gaurav") "name is correct" else "name is false")


        //infix function
//        infix fun String.concatFunction(secondString: String):String{
//        return this+secondString
//        }
//
//
//
//        var stringConcated:String = "gaurav" concatFunction "pathak";
//        println(stringConcated)


//        operator funciton
//        operator fun Int.times(x:String):String{
//                println("we are doing multiplication")
//                return "${this} is the type of ${x}"
//        }
//
//
//        println(5 * "6")

//        //class and objects
//        class Name(val name:String){}
//
//        var nameGaurav=  Name("gaurav")
//
//        print(nameGaurav.name)


//    generics

//    class printList<S> (var listOfName:Array<S>){
//
//        fun printNames(): Array<String>{
//            var updatedList= mutableListOf<String>()
//            for(names in listOfName){
//                updatedList.add(names.toString()+'s')
//            }
//            return listOfName
//        }
//
//    }
//
//
//    println("onreo")
//    var obj= printList<String>(arrayOf("name","gaurav","oreno"))
//    var result1= obj.printNames()
//    result1.forEach { print(it) }
//    println()
//
//
//    var obj2=printList<Int>(arrayOf(1,2,3))
//
//    var result2=obj2.printNames()
//    result2.forEach { print(it) }
//    println()

////    companion object
////    it can only be used outiside of function or class or inside the main class
//println(name.naming)

////    lambda funciton
//    var sum:(Int,Int)->Int={a,b->a+b}
//    println(sum(2,3))

////    extension function
//    class namaiva(var name:String){
//
//    }
//
//    fun namaiva.printName():String{
//        return this.name
//    }
//
//    var namaiva2= namaiva("oreno")
//    print(namaiva2.printName())

////    use of let
//    fun customPrint(it:String):Unit{
//        print(it)
//    }
//
//    val empty = "test".let {
//        customPrint(it)
//        it.isEmpty()
//    }
//    println(" is empty: $empty")

//    delegrate pattern


//    class ScreamBehavior(val n:String): SoundBehavior {                                // 2
//        override fun makeSound() = println("${n.uppercase()} !!!")
//    }
//
//    class RockAndRollBehavior(val n:String): SoundBehavior {                           // 2
//        override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
//    }
//
//    // Tom Araya is the "singer" of Slayer
//    class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)                       // 3
//
//    // You should know ;)
//    class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)              // 3
//
//        val tomAraya = TomAraya("Thrash Metal")
//        tomAraya.makeSound()                                                           // 4
//        val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
//        elvisPresley.makeSound()

    //destructure of array
    var (x,y,z)=arrayOf(3,4,3)
    print(x)

}


