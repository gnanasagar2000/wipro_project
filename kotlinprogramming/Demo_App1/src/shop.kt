import java.util.Date

data class TransactionRecord(val amount: Double, val date: Date)

fun categorizeTransaction(transaction: TransactionRecord): String {
    return when {
        transaction.amount<0->"Invalid transaction amount"
        transaction.amount<=50.0->"Food"
        transaction.amount<=100.0->"Utilities"
        transaction.amount<=200.0->"Entertainment"
        else -> "Other"
    }
}
fun main() {
    val transactions = listOf(
        TransactionRecord(20.0,Date()),
        TransactionRecord(80.0,Date()),
        TransactionRecord(150.0,Date()),
        TransactionRecord(-10.0,Date())
    )

    transactions.forEachIndexed { index, transaction ->
        val category = categorizeTransaction(transaction)
        println("Transaction $index categorized as: $category")
    }
}
