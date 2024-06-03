import java.util.Scanner

fun main() {

    val name: String = "Sagar"
    var age: Int = 23
    val pi: Double = 3.14
    val isTrue: Boolean = true


    val sum = 2 + 3
    val division = 10 / 2
    val product = 7 * 8


    val greeting = "Hello, $name! You are $age years old."


    val num = 10
    val result = if (num > 0) "Positive" else "Non-positive"


    for (i in 1..5) {
        println(i)
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    val additionResult = add(3, 5)

    println("Sum: $sum")
    println("Division: $division")
    println("Product: $product")
    println(greeting)
    println("Result: $result")
    println("Result of addition: $additionResult")


    val scanner = Scanner(System.`in`)
    print("Enter your age: ")
    age = scanner.nextInt()
    println("Your age is $age")
}


