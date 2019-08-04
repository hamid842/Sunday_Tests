package Nahid

data class Sample(val name:String , val age:Int){
    constructor(s:String): this(s.substringBefore(":"), s.substringAfter(":").toInt())

    override fun toString(): String {
        return "$name - $age"
    }
}


fun main(args: Array<String>) {
    val result1 = Sample("nahid", 32)
    println(result1)
    val result2 = Sample("nahid:32")
    println(result2)

    val result3 = result1.component1()
    println(result3)
    val result4 = result1.component2()
    println(result4)

    val nameState = getNameAndState(101)
    println(nameState.first)
    println(nameState.second)

    val student = StudentKotlin()
    student addKotlinScore 87.6
    println(student.kotlinScore)

    val stringUpper = StringUpper()
    val upper = stringUpper upperCase "i am kotlin"
    println(upper)
}

fun getNameAndState(id: Int):Pair<String?, String?>{
    require(id>0 ,{"Error: id is less than 0"})
    val name1:Map<Int , String> = mapOf(101 to "Java", 102 to "C++")
    val state1:Map<Int , String> = mapOf(101 to "Kotlin" , 102 to "Sql")
    val name2 = name1[id]
    val state2 = state1[id]
    return Pair(name2, state2)
}


class StudentKotlin(){
    var kotlinScore = 1.3
    infix fun addKotlinScore(score: Double): Unit{
        this.kotlinScore = kotlinScore +score
    }
}

class StringUpper(){
    infix fun upperCase(str: String): String{
       return if(str.isNotEmpty()) str.toUpperCase() else ""
    }
}