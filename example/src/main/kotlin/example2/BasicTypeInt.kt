package example2
fun main(){
    val a=4// 타입 안적어주면 기본은 Int
    val b:Byte = 126 // Byte
    val c = 3000000000 //30억 int 범위 벗어남 자동으로 Long
    val d = 30L // Long
    println("a type is = ${a.javaClass}")
    println("b type is = ${b.javaClass}")
    println("c type is = ${c.javaClass}")
    println("d type is = ${d.javaClass}")
}