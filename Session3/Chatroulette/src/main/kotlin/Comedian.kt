class Comedian(override val name : String) : Person(name) {

    override fun talk(){
        tellJoke()
    }
    fun tellJoke(){
        println("Insert funny joke here")
    }
}