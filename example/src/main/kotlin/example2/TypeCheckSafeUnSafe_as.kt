package example2


fun main(args: Array<String>) {
    val a:Any = "kotlin"
    val castA = a as String // unsafe cast
    println("a cast to String $castA")
    val b:Any? = null
    val castB = b as? String // safe cast
    println(castB)


}