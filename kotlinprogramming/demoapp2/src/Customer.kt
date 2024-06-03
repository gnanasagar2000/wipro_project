import java.util.Scanner

data class Transaction(val amount: Double, val description: String)

class Customer(private val username: String, private val password: String) {
    private val transactions = mutableListOf<Transaction>()


    fun login(inputUsername: String, inputPassword: String): Boolean {
        return username == inputUsername && password == inputPassword
    }


    fun addTransaction(amount: Double, description: String) {
        val transaction = Transaction(amount, description)
        transactions.add(transaction)
    }

    // Function to display a summary of expenses
    fun displayExpenseSummary() {
        println("Expense Summary for $username:")
        println("------------------------------")
        transactions.forEach { println("${it.description}: ${it.amount}") }
        println("Total Expenses: ${transactions.sumByDouble { it.amount }}")
    }
}

fun main() {
    // Creating a customer
    val customer = Customer("username", "password")

    // Simulating login
    val scanner = Scanner(System.`in`)
    println("Enter username:")
    val inputUsername = scanner.next()
    println("Enter password:")
    val inputPassword = scanner.next()

    if (customer.login(inputUsername, inputPassword)) {
        println("Login successful!")
        // Adding transactions
        customer.addTransaction(100.0, "Groceries")
        customer.addTransaction(50.0, "Dinner")

        // Displaying expense summary
        customer.displayExpenseSummary()
    } else {
        println("Invalid username or password.")
    }
}
