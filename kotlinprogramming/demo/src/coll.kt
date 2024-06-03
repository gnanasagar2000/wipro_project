
val fruits = listOf("Apple", "Banana", "Orange", "Grapes", "", "", "Blueberry", "")

fun ok() {
    println("First fruit: ${fruits[0]}")
    println("Last Element: ${fruits.last()}")

    for (fruit in fruits) {
        println(fruit)
    }

    val res = fruits.filter { it.isNotEmpty() }
    print(res)
}

fun setok() {
    var set = setOf("Sagar", "Theja", "Theja", "Geetha", "Rahul")

    set.forEach(::println)
}

// to -> :
fun mapok() {
    val map = mapOf(1 to "Sagar", 2 to "Theja", 3 to "Geetha")

    map.entries.forEach(::println)
}

fun main() {
    mapok()
}
