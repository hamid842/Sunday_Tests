package Hamid.SundayTest_20190804

val numbers = 1..100
val numbers1 = IntRange(1, 100)
val numbers99 = 1 until 100
val backward = 100 downTo 1
val step = 1..100 step 5
val backStep = 100 downTo 1 step 5
val contain58 = 109 in numbers

fun main(args: Array<String>) {
    val list: List<Iterable<Any>> = listOf(
        numbers,
        numbers1,
        numbers99,
        backward,
        step,
        backStep
    )
    list.forEach(::printList)
    println(contain58)
}

fun printList(list: Iterable<Any>) {
    list.joinToString(" - ")
        .let { println(it) }
}