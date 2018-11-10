fun main(args: Array <String>) {
    val str = "May the force be with you."
    println(str)

    val rawCrawl = """|A long time ago
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMM BUMM
    """.trimMargin()
    println(rawCrawl)

//    for (char in str) {
//        println(char)

    val contentEquals = str.contentEquals("May the force be with you")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val name = "Luke Skywalker"
    val lsColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$name has a $lsColor light saber and drives a $vehicle and is $age years old.")
    println("Lukes full name $name has ${name.length} letters in it.")


}