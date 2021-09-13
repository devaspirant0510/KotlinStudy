package example1

fun main(args: Array<String>) {
    println("Hello World!")

    //println("program arguments: ${args[0]}");
    println("Program arguments: ${args.contentToString()}")
}