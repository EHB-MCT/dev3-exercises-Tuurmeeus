fun main() {
    val Persons = arrayOf(Comedian("Tuur"), Student("Jan"), Teacher("Bram"))
    val randomPick = Persons.random()
    randomPick.introduce()
    randomPick.talk()
}

