package Hamid.SundayTest_20190728

import kotlin.math.PI

fun myHigherOrder(r : Double , poc:(Double)->Double):Double{
    return poc(r)
}
fun perimeterOfCyrcle(r:Double):Double{
    return 2*r* PI
}
fun areaOfCyrcle(r:Double):Double{
    return r*r* PI
}
fun main(args: Array<String>) {
    val result = myHigherOrder(10.00,::areaOfCyrcle)
    println(result)
}
