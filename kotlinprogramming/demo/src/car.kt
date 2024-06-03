import kotlin.jvm.optionals.toList

class car {
    var brand: String = ""
    var model: String = ""
    var price: Double = 0.0

    fun getInfo(): String {
        return "$brand, $model, $price"
    }

}

fun main() {
    val myCar = car()
    myCar.brand = "benz"
    myCar.model = "m5 Comp"
    myCar.price = 23.0

    val myCar2 = car()
    myCar2.model = "Seltos"
    myCar2.brand = "Kia"
    myCar2.price = 15.0

    val myCar3 = car()
    myCar3.model = "xc90"
    myCar3.brand = "Volvo"
    myCar3.price = 95.0

    val cars = arrayOf(myCar, myCar2, myCar3)
    val comparator = compareBy<car> { it.price }
    val pricycar = cars.asList().stream().max(comparator).get();


    println(pricycar.getInfo())
}
