package Day2

fun main(args: Array<String>) {
//    val sum: (Int, Int) -> Int = { num1, num2 ->
//        println("Calculating sum of $num1 and $num2")
//        val result = num1 + num2
//        println("Sum is $result")
//        result
//    }
//
//    val sumLambda = sum(2, 3) // Call the sum function
//    println(sumLambda)
//
//    for (i in 1..6) {
//        print("$i ")
//    }

    var name = "Geeks"
    var name2 = "forGeeks"

    // traversing string without using index property
    for (alphabet in name)   print("$alphabet ")

    // traversing string with using index property
    for (i in name2.indices) print(name2[i]+" ")
    println(" ")

    // traversing string using withIndex() library function
    for ((index,value) in name.withIndex())
        println("Element at $index th index is $value")


    //continue and break
    var num1 = 4
     while (num1 > 0) {
        num1--
        var num2 = 4

         while (num2 > 0) {
            if (num1 <= 2)
                continue
            println("num1 = $num1, num2 = $num2")
            num2--
        }
    }
}
