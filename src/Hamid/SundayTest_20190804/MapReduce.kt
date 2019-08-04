package Hamid.SundayTest_20190804

import kotlin.reflect.full.declaredMemberProperties
import Hamid.SundayTest_20190804.people as people

/* =================== collection Operations ====================
- map : converts a collection of elements to a new collection os elements
- reduse : converts a collection to a single value : for example sum
- sort : sorts optional
 */
data class Person (val name :String ,
                   val nationalCode : String,
                   val age :Int
)
val people : List<Person> = listOf(
    Person("Hamid mohamadi","4284821131",37),
    Person("Ramin Nasiri","0010258845",40),
    Person("Mehran Modiri","5458635368",48),
    Person("Sara Akhavan","4782163960",18)
)
val emptyPeople = emptyList<Person>()
object Result {
    val ages = people.map { it.age }
    val firsNames = people.map { it.name }.map { it.substringBefore(" ") }
    val totalAge = people.map { it.age }.reduce { acc, i -> acc + i }
    val emptylist = emptyPeople.sumBy { it.age }
}

fun main(args: Array<String>) {
    Result::class.declaredMemberProperties.forEach {
        println("${it.name} = ${it.get(Result)}")
    }
}
