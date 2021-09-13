package example1

fun whenFunc(value:Any){
    when(value){
        0->println("0 입니다.")
        "two"-> println("two 입니다.")
        3.14-> println("3.14 입니다.")
        else-> println("아무것도 해당되지 않아요")
    }

}
fun main(args:Array<String>){
    whenFunc(0)
    whenFunc("two")
    whenFunc(3.14)
    whenFunc(3243)


}