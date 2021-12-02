class Student(override val name : String) : Person(name), ChatPartner {

    override fun talk(){
        funFact()
    }
    fun funFact(){
        println("Did you know that the hummingbird is the only bird that can fly backwards?")
    }
}