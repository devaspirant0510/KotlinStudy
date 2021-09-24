package example2

fun main(){
    val a:String = "kt"
    val b:String? = "kt"
    var c:String = a
    c+="34";

    println("a==b -> ${a==b}")
    println("a===b -> ${a===b}")
    println("a==c -> ${a==c}")
    println("a===c -> ${a===c}")
}