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
    } else{
        gameOver()
    }


}

fun success(){

}

fun gameOver(){
    println("Gollem starts eating you brahnjamgznetjbrawl....")

}