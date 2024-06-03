import java.lang.Exception

class InsufficientBalanceException(message: String) : Exception(message)

class InvalidTransactionException(message: String) : Exception(message)

class TransactionProcessor(private var balance: Double) {

    fun processTransaction(amount: Double) {
        if (amount > balance) {
            throw InsufficientBalanceException("Insufficient balance to process transaction")
        }

        if (amount <= 0) {
            throw InvalidTransactionException("Invalid transaction amount")
        }

        balance -= amount
        println("Transaction processed successfully. Remaining balance: $balance")
    }
}

fun main() {
    val transactionProcessor = TransactionProcessor(100.0)

    try {
        transactionProcessor.processTransaction(-50.0)
    } catch (e: InsufficientBalanceException) {
        println("Error: ${e.message}")
    } catch (e: InvalidTransactionException) {
        println("Error: ${e.message}")
    }
}


