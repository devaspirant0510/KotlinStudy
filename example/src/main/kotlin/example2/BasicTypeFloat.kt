package example2

fun main(){
    val a = 3.14 // Double 기본값
    val b = 3.14f // Float 쓸때는 뒤에 f
    val c:Float = 3.14f // Type 을 지정해도 Float 이면 f
    val d = 1.3242512351235
    val e = 1.3242512351235f // Float 범위를 벗어나면 자동으로
    println("a type is = ${a.javaClass} $a")
    println("b type is = ${b.javaClass} $b")
    println("c type is = ${c.javaClass} $c")
    println("d type is = ${d.javaClass} $d")
    println("e type is = ${e.javaClass} $e")
}