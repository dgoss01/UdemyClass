fun main(args: Array<String>) {

//    var name : String = "JohnnyB"
//    name = null

    var nullableName : String? = "Do I really exist?"
    var length = 0
  //  nullableName = null

    if (nullableName != null) {
        println(nullableName.length)
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)


    val l = if (nullableName != null) nullableName.length else -1

    //second method Safe Call Operator '?'
    println(nullableName?.length)

    // Third method is Elvis Operator

    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No One knows me..."

    println(noName)

    // !!
    println(nullableName!!.length)
}