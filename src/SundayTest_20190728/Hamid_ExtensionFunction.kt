package SundayTest_20190728

val str1 = "Hamid"
val str2 = "Mohamadi"
val str3 = "Mr."
val res = str3.add(str1,str2)

fun String.add(s1: String, s2: String): String {
    return this + s1 + " " + s2
}
fun main(args: Array<String>) {
    println(res)
}