data class Transaction(val id: Int, var amount: Double, var description: String)

class TransactionList {
    private val transactions = mutableListOf<Transaction>()
    private var nextId = 1


    fun addTransaction(amount: Double, description: String) {
        val transaction = Transaction(nextId++, amount, description)
        transactions.add(transaction)
    }


    fun deleteTransactionById(id: Int) {
        val iterator = transactions.iterator()
        while (iterator.hasNext()) {
            val transaction = iterator.next()
            if (transaction.id == id) {
                iterator.remove()
                return
            }
        }
    }


    fun editTransactionById(id: Int, newAmount: Double, newDescription: String) {
        transactions.find { it.id == id }?.apply {
            amount = newAmount
            description = newDescription
        }
    }


    fun getAllTransactions(): List<Transaction> {
        return transactions.toList()
    }
}


fun main() {
    val transactionList = TransactionList()


    transactionList.addTransaction(100.0, "Groceries")
    transactionList.addTransaction(50.0, "Dinner")


    println("All transactions:")
    transactionList.getAllTransactions().forEach { println(it) }

    transactionList.editTransactionById(1, 120.0, "Groceries and household items")


    transactionList.deleteTransactionById(2)

    println("\nAll transactions after editing and deleting:")
    transactionList.getAllTransactions().forEach { println(it) }
}
