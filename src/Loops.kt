fun main(args: Array<String>) {

    val rebels = arrayListOf("Leia", "Luke", "Han Solo", "Mon Mothman")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels) {
        println("Name: $rebel")
    }

    for ((key, value) in rebelVehicles) {
        println("$key drives a $value")
    }

    var x = 0

    while (x <= 10 ) {
        println(x)
        x++
    }
}