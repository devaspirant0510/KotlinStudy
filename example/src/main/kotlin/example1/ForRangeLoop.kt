package example1

fun main(args:Array<String>){
    println("======= if number1 in 4...8 =======")
    val number1 = 5;
    if (number1 in 4..8){
        println("$number1 in 4~8")
    }
    println("======= if number2 !in 4...8 =======")
    val number2 = 0;
    if (number2 !in 4..8){
        println("$number2 not in 4~8")
    }
    println("========= for i in 1..7 =========")
    for (i in 1..7){
        print("$i ")
    }
    println()
    println("====== for i in 1 until 7 ======")
    for (i in 1 until 7){
        print("$i ")
    }
    println()
    println("====== for i in downTo 1 =======")
    for (i in 7 downTo 1){
        print("$i ")
    }
    println()
    println("====== for i in 1..7 step 2 ======")
    for (i in 1..7 step 2){
        print("$i ")
    }

}