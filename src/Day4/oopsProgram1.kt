//package Day4
//
//
//class animal (var name:String,var tails:Int){
//
//    fun getName():String{
//        return this.name;
//    }
//    fun getTails():Int{
//        return this.tails;
//    }
//
//    fun setName(name:String):Unit{
//        this.name=name
//    }
//    fun setTails(tails:Int):Unit{
//        this.tails=tails;
//    }
//
//    var sound:(String)->Unit  = {sound-> println(sound) }
//
//}
//
//fun main(){
//    var dog= animal("dog",2)
//    dog.sound("bhaw bhaw")
//
//    println("name ${dog.name} and tails ${dog.tails}")
//
//    var cat= animal("cat",4)
//    cat.name="cat"
//    cat.tails=2
//    cat.sound("meow meow")
//
//    println("name ${cat.name} and tails ${cat.tails}")
//}


fun main(args: Array<String>) {
    val emp = employee(18018, "Sagnik")
    // default value for emp_name will be used here
    val emp2 = employee(11011)
    // default values for both parameters
    // because no arguments passed
    val emp3 = employee()
}

class employee(emp_id : Int = 100 , emp_name: String = "abc") {
    val id: Int
    var name: String

    // initializer block
    init {
        id = emp_id
        name = emp_name

        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }
}
