fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors", "Lizard", "Spock")
    val computerChoice = options.random()

    println("Welcome to rock paper scissors!")
    println("Pick your choice: ")
    val userChoice = readLine()
    if(userChoice != "Rock" || userChoice != "Paper" || userChoice != "Scissors" || userChoice != "Lizard" || userChoice != "Spock") {
        println("Foutieve input, probeer opnieuw: ")
        userChoice = readLine()
    }

    println("Computer picked: $computerChoice")
    println("User picked: $userChoice")

    fun determineWinner(computerChoice: String, userChoice: String?){
        if(computerChoice == userChoice){
            println("It's a draw")
        }
        when (userChoice) {
            "Rock" -> if(computerChoice == "Paper") {
                println("Computer wins the game!")
            } else {
                println("Player wins the game!")
            }
            "Paper" -> if(computerChoice == "Scissors") {
                println("Computer wins the game!")
            } else {
                println("Player wins the game!")
            }
            "Scissors" -> if(computerChoice == "Rock"){
                println("Computer wins the game!")
            } else {
                println("Player wins the game!")
            }
        }
    }
    determineWinner(computerChoice, userChoice)

}

