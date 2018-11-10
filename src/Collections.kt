fun main(args: Array<String>) {

//    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
//
//    println(imperials.sorted())
//    println(imperials[2])
//    println(imperials.first())
//    println(imperials)
//    println(imperials.contains("Luke"))
//
//    for (i in imperials) {
//        println(i)
//    }

//    val rebels = arrayListOf("Leia", "Luke", "Han Solo", "Mon Mothman")
//    println(rebels.size)
//    rebels.add("Chewbacca")
//    println(rebels)
//    rebels.add(0, "Lando")
//    println(rebels)
//    println(rebels.indexOf("Luke"))
//    rebels.remove("Han Solo")
//    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")

    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", defaultValue = "This ship doesn't exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "X-Wing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)

}