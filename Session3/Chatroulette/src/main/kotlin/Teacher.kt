class Teacher(override val name : String) : Person(name), ChatPartner {

    override fun talk(){
        gossip()
    }
    fun gossip(){
        println("Did you know that the teacher picks his nose during class?")
    }
}