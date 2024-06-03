import java.util.Date

data class Transaction(val amount: Double, val date: Date, val category: String)

fun main() {
    val transaction = Transaction(100.0, Date(), "Groceries")
    println("Transaction Details:")
    println("Amount: ${transaction.amount}")
    println("Date: ${transaction.date}")
    println("Category: ${transaction.category}")
}


