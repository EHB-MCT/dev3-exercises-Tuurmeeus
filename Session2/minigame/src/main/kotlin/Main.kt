fun main() {
    println("Welcome to gollem's cave, answer the riddle correctly and het won't eat you.")
    challengeOne()


}

fun challengeOne(){
    println("What has roots as nobody sees," +
            " Is taller than trees," +
            " Up, up it goes," +
            " And yet never grows?")

    val correctAnswer = setOf<String>("Mountains")
    val answer = readLine()

    if (correctAnswer.contains(answer)){
        println("Well done traveler, you advance to the next level.")
        challengeTwo()
    } else{
        gameOver()
    }


}

fun challengeTwo(){
    println()
    println()
    println("Guess the dice roll: low or high?")
    var guess : String

    do {
        guess = readLine().toString()
    } while (!setOf<String>("low", "high").contains(guess))
    val diceRoll = rollDice(6)
    println("The dice rolled: $diceRoll")
    val possibleResults = if(guess == "low") setOf<Int>(1, 2, 3) else setOf<Int>(4, 5, 6)
    if(possibleResults.contains(diceRoll)){
        println("Good job 1 step closer to survival")
        challengeThree()
    } else{
        gameOver()
    }



}

fun challengeThree(){
    println("Gollem tries to kill you anyways, you have to pick the right weapon for the task:")
    println("1. Dagger")
    println("2. Longbow")
    println("3. Sword")
    var weaponChoice : Int

    do {
        println("Your choice:")
        weaponChoice = readLine()?.toInt() ?: 0

    } while(!setOf<Int>(1, 2, 3).contains(weaponChoice))

    when (weaponChoice) {
        1 -> {
            println("The dagger is too short too fight against such a mighty adversary!")
            challengeTwo()
        }
        2 -> {
            println("Your arrow misses! And you have to run for your life")
            gameOver()
        }
        3 ->
            println("A mighty sword for a mighty adversary, you slay the foul beast!")
    }
}

fun challengeFour(){
    println("A lock blocks the exit of the cave, can you guess the code?")
    var codeGuess: Int
    val answer = rollDice(100)
    do {
        println("Your guess:")
        codeGuess = readLine()?.toInt() ?: 0

        if(codeGuess == answer){
            println("The number is right! And the lock opens, Freedom!")
        } else if (codeGuess < answer){
            println("Need a smaller number")
        } else{
            println("Need a higher number")
        }
    } while(answer != codeGuess)
}

fun rollDice(sides: Int): Int{
    return(Math.random() * sides + 1).toInt()

}

fun success(){

}

fun gameOver(){
    println("Gollem starts eating you brahnjamgznetjbrawl....")

}