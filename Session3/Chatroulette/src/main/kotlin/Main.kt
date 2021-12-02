fun main() {
    val Persons = arrayOf(Person("Tuur"), Person("Jan"))
    introduction(Persons)
}

fun introduction(Persons: Array<Person>){
    val randomPick = (Math.random() * 2).toInt()
    println(" Hallo ik ben ${Persons[randomPick].name}, aangename kennismaking!")
}