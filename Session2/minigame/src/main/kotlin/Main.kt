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
    } else{
        gameOver()
    }



}

fun rollDice(sides: Int): Int{
    return(Math.random() * sides + 1).toInt()

}

fun success(){

}

fun gameOver(){
    println("Gollem starts eating you brahnjamgznetjbrawl....")

}