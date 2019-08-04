package SundayTest_20190804

data class Person (val firstName :String ,
                   val lastName: String ,
                   val nationalCode : String,
                   val age :Int
)
val people : List<Person> = listOf(
    Person("Hamid","mohamadi","4284821131",37),
    Person("Ramin","Nasiri","0010258845",40),
    Person("Mehran","Modiri","5458635368",48),
    Person("Sara","Jabbari","4782163960",18)
)
val emptyPeople = emptyList<Person>()