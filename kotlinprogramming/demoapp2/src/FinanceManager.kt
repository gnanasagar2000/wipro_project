import java.time.LocalDate

data class TransactionData(val amount: Double, val description: String, val date: LocalDate)

class FinanceManager {
    private val transactions = mutableListOf<TransactionData>()
    fun addTransaction(transaction: TransactionData) {
        transactions.add(transaction)
    }


    fun filterAndSort(predicate: (TransactionData) -> Boolean, comparator: Comparator<TransactionData>) {
        val filteredAndSortedTransactions = transactions.filter(predicate).sortedWith(comparator)
        filteredAndSortedTransactions.forEach { println("${it.date}: ${it.description}: ${it.amount}") }
    }
}

fun main() {
    val financeManager = FinanceManager()


    financeManager.addTransaction(TransactionData(100.0, "Groceries", LocalDate.of(2024, 5, 10)))
    financeManager.addTransaction(TransactionData(50.0, "Dinner", LocalDate.of(2024, 5, 12)))
    financeManager.addTransaction(TransactionData(80.0, "Lunch", LocalDate.of(2024, 5, 8)))


    println("Filtered and sorted by date:")
    financeManager.filterAndSort({ it.date >= LocalDate.of(2024, 5, 9) }) { transaction1, transaction2 ->
        transaction1.date.compareTo(transaction2.date)
    }


    println("\nFiltered and sorted by amount:")
    financeManager.filterAndSort({ it.amount >= 80.0 }) { transaction1, transaction2 ->
        transaction1.amount.compareTo(transaction2.amount)
    }
}
