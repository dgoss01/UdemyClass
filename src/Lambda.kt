fun main(args: Array<String>) {

    val printMessage = { message: String -> println(message)}

    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y}
    println(sumA(5, 3))

    val sumB : (Int, Int) -> Int = {x, y -> x +y}

    fun downloadData(url: String, completion: () -> Unit) {
        //sent a download request
        //we got back data
        //there were note network errors
        completion()
    }
    // call downloadDataFunction
    downloadData("fakeurl.com", {println("The code in this block will only run" +
        "after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // sent a download request
        // got back car data
        val car = Car(make = "Tesla", model = "Model X", color = "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }
    downloadCarData("fakeUrl.com") {
        println(it.color)
        println(it.make)
        println(it.model)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //make the web request
        //get the results back
        val webRequestSuccess = false
        if (webRequestSuccess) {
            //received truck data
            val truck = Truck(make = "Ford", model = "F-150", towCapacity = 10000)
            completion(truck, true)
        } else{
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") {truck, success ->
        if (success == true) {
            //do sometihing with truck
            truck?.tow()
        } else {
            //handle the web request failure
            println("Something went wrong")
        }
    }
}