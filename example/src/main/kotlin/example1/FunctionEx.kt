package example1

fun sum(a:Int,b:Int):Int{
    return a+b;
}
fun sumSimple(a:Int,b:Int) = a+b

fun callUnitFun(msg:String):Unit{
    println("call Unit function")
    println("you message is :$msg")

}
fun main(args:Array<String>){
    println("5+10 = ${sum(5,10)}");
    println("51+32 = ${sumSimple(51,32) }")
    println("========== call function ============")
    callUnitFun("kotlin")
}