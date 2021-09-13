package example1

class Test{
    fun printStr():String{
        return "test"
    }

}
fun main(args:Array<String>){
    val num1 = 34
    println("num1 is $num1")
    val test = Test()
    println("test function ${test.printStr()}")

}