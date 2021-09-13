package example1

fun moneyStatus(name: String, money: Int?): String? {
    return "$name 님의 재산은 ${money?:"0"} 원 입니다."

}
fun main(args:Array<String>){
    val name1:String = "seungho" // non-null
//    name1:String=null // error
    var name2:String? = "kotlin" // nullable
    name2 = null
    println("name1.length = ${name1.length}")
    println("name2?.length = ${name2?.length}")

    println(moneyStatus("seungho",2000000000))
    println(moneyStatus("maga",null))

    val frameWork:String? = "android"
    println(frameWork?.uppercase())
    val library:String? = null
    println(library?.uppercase())
    //println(library!!.uppercase())
    println("라이브러리는 ${library?:"없습니다."}")



    
}
