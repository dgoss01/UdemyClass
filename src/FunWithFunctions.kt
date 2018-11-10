import java.util.Scanner

fun main(args: Array<String>) {


fun printRows(row: Int) {
    for (i in 1..row) {
        for (k in 1..(row - i)) {
            print(" ")
        }
        for (h in 1..(i)) {
            print("#")
        }
        for (hh in 1..i) {
            print("#")
        }
        print("\n")
    }
}

    val reader = Scanner(System.`in`)
    print("How many rows? ")

    var n:Int = reader.nextInt()

    if (n < 1 || n > 23){
        println("Error 231: Must be between 1 and 23.")
    }

    printRows(n)
}
