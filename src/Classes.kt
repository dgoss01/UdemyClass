//class Car(val make: String, val model: String, var color: String) {
//
//    fun accelerate() {
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model.")
//    }
//}
//

open class Vehicle(val make: String, val model: String) {

    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("Parking the $model.")
    }
    fun brake() {
        println("STOP!")
    }

}
class Truck(make: String, model: String, val towCapacity: Int)  : Vehicle(make, model) {

    fun tow() {
        println("Taking the horses to the rodeo.")
    }
    fun details() {
        println("The $make $model has a towing capacity of $towCapacity pounds")
    }
    override fun accelerate() {
        println("bloooowwwwblooowwwww")
    }
}


class Car(make: String, model: String, var color: String) : Vehicle(make, model) {

    override fun accelerate() {
        println("We are going ludicrous mode!")
    }
}

//class Truck(make: String, model: String, var towCapacity: Int) : Vehicle(make, model) {
//
//}
fun main(args: Array<String>) {

    val tesla = Car(make = "Tesla", model = "Model S", color = "black")
    tesla.accelerate()

    val truck = Truck(make = "Ford", model = "F-150", towCapacity = 10000)
    truck.accelerate()


//
//    val car = Car(make = "Toyota", model = "Avalon", color = "red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//    car.color = "green"
//    car.details()
//
//    val truck = Truck(make = "Ford", model = "F-150", towingCapacity = 10000)
//    truck.tow()
//    truck.details()
}