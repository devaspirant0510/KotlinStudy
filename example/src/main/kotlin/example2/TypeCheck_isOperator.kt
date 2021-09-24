package example2

fun main(){
    val a = "kotlin"
    val b:Byte = 23;
    val c = 435345;
    if(a is String){
        println("$a 는 String 입니다.")
    }
    if(b is Byte){
        println("$b 는 Byte 입니다.")
    }
    if(c is Int){
        println("$c 는 Int 입니다.")
    }
}