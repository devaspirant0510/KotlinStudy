package example1

fun main(args:Array<String>){
    val mostLang = listOf("javascript", "python", "kotlin", "java", "go")

    var i = 0;
    while (true) {
        if (i == mostLang.size) {
            break
        }
        println(mostLang[i])
        i++

    }
    var j = 0;
    while (j < mostLang.size) {
        println(mostLang[j])
        j++
    }
}