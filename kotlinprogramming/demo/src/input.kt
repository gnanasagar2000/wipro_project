import java.util.Scanner
import kotlin.math.max

fun main() {
    var sc = Scanner(System.`in`)

    SagarsExample()

    print(sum(3, 6))
}


fun sum(a: Int, b: Int): Int {
    val sum = a.dec() + b.inc()
    return sum
}

fun SagarsExample() {
    val cars = arrayOf("Lamborghini", "Bugatti", "Ferrari", "GT3RS")
    for (car in cars) {
        println(car)
    }
}