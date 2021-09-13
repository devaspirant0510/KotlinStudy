package example1

fun main(args:Array<String>){
    val a:Int
    var b:String
    val c = 3;
    var d  = "dString"
    a=34
    b="bString"
    println("a = $a is Int? ${a is Int}")
    println("b = $b is String? ${b is String}")
    println("c = $c is Int? ${c is Int}")
    println("d = $d is String ${d is String}")
}