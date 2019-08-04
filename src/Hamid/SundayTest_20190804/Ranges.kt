package Hamid.SundayTest_20190804

// ==================== Ranges =====================

val numbers = 1..100
//val numbers1 = IntRange(1,100)
val numbers2 = 1 until 100   // until is a function = ".."
val backWard = 100 downTo 1
val everyOther = numbers step 2  // = 1..100 step 2
val alphabet = 'a'..'z'

fun printList(list: Iterable<Any>) {
    list.joinToString("-")
        .let { println(it) }
}

fun main(args: Array<String>) {
    val list = listOf(numbers, numbers2, backWard, everyOther, alphabet)
    list.forEach(::printList)

}