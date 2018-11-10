fun main(args: Array<String>) {

    val a = 2
    val b = 3

    if (a == b) {
        println("YES!!!")
    }
    else {
        println("NO!!!")
    }

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("You can buy this")
    }
    else {
        println("Sorry, you broke.")
    }

    val degrees = 60
    // == != > < >= <= &&
    if (degrees >= 70) {
        println("This is some nice weather.")
    }
    else if (degrees < 70 && degrees > 50) {
        println("This is the best weather!!")
    }
    else{
        println("It's nicer out.")
    }

    val isHungry = false
    val isBored = true

    if (isHungry == true || isBored == true) {
        println("Let's get pizza.")
    }

    val x = 4

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x is not 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "meh") {
        if (mood == "angry") {
            println("Run for the hills, Vader is angry.")
        }
        else {
            println("Whatever you do, don't make Vader angry.")
        }
    }

    vaderIsFeeling()
}