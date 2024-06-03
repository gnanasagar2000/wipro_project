class Transaction(val amount: Double?, val description: String?)

fun main() {
    val transaction: Transaction? = null

    val amount = transaction?.amount
    val description = transaction?.description

    val amountOrDefault = amount ?: 0.0
    val descriptionOrDefault = description ?: "No description available"

    println("Amount: $amountOrDefault")
    println("Description: $descriptionOrDefault")
}


