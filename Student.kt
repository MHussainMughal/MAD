data class Student(val name:String,val SID:Int,val Course:String)
fun main(args: Array<String>)
{
    val s1=Student("Kamran",11,"MAD")
    val s2=Student("Maryam",10,"MAD")
    val s3=Student("Summeet",110,"MAD")
    val s4=Student("Summeet",110,"MAD")
    val s5=Student("Summeet",110,"MAD")
    val s6=Student("Summeet",110,"MAD")

    val listOfStudent= listOf(s1,s4,s2,s5,s3)

    for (i in listOfStudent.asSequence())
        println(i)
}