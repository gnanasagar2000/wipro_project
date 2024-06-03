import java.time.LocalDate


open class Transaction(val amount: Double, val description: String, val date: LocalDate)


class Income(amount: Double, description: String, date: LocalDate) : Transaction(amount, description, date)


class Expense(amount: Double, description: String, date: LocalDate) : Transaction(amount, description, date)

fun main() {

    val income = Income(1000.0, "Salary", LocalDate.of(2024, 5, 15))
    val expense = Expense(200.0, "Groceries", LocalDate.of(2024, 5, 16))

    println("Income Transaction:")
    println("Amount: ${income.amount}")
    println("Description: ${income.description}")
    println("Date: ${income.date}")

    println("\nExpense Transaction:")
    println("Amount: ${expense.amount}")
    println("Description: ${expense.description}")
    println("Date: ${expense.date}")
}

