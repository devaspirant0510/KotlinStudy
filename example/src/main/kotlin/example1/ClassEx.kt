package example1
open class MyClass{
    fun root(){
        println("i am root")
    }
}
class Rectangle(var width:Int,var height:Int): MyClass() {
    fun getArea()=width*height
    fun me(){
        root()
    }
}
fun main(args:Array<String>){
    val rect = Rectangle(10,4)
    println("rect area (width :${rect.width} height :${rect.height}) = ${rect.getArea()}")
    rect.me()
}