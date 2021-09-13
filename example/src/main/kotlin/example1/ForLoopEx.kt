package example1


fun main() {
    val mostLang = listOf("javascript", "python", "kotlin", "java", "go")
    println("=========== for loop ===============")
    for (item in mostLang) {
        println(item)
    }
    println("========== for loop index ==========")
    for (idx in mostLang.indices) {
        println("#$idx : ${mostLang[idx]}")
    }
    println("========== for each loop ==========")
    mostLang.forEachIndexed { index, value ->
        println("#$index #")
    }

}
