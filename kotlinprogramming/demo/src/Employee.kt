import java.util.Scanner

data class Employee(val id: Int, var name: String, var position: String, var salary: Double) {
    override fun toString(): String {
        return "Employee(id=$id, name='$name', position='$position', salary=$salary)"
    }
}

class EmployeeManagementSystem {
    private val employees = mutableListOf<Employee>()
    private var nextId = 1

    fun addEmployee(name: String, position: String, salary: Double) {
        val employee = Employee(nextId++, name, position, salary)
        employees.add(employee)
        println("Employee added successfully: $employee")
    }

    fun removeEmployee(id: Int) {
        val employee = employees.find { it.id == id }
        if (employee != null) {
            employees.remove(employee)
            println("Employee removed successfully: $employee")
        } else {
            println("Employee with ID $id not found")
        }
    }

    fun printAllEmployees() {
        println("List of Employees:")
        employees.forEach { println(it) }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val empSys = EmployeeManagementSystem()

    var option = 0
    while (option != 4) {
        println("\nEmployee Management System Menu:")
        println("1. Add Employee")
        println("2. Remove Employee")
        println("3. View All Employees")
        println("4. Exit")
        print("Enter your choice: ")
        option = scanner.nextInt()

        when (option) {
            1 -> {
                print("Enter employee name: ")
                val name = readLine() ?: ""
                print("Enter employee position: ")
                val position = readLine() ?: ""
                print("Enter employee salary: ")
                val salary = scanner.nextDouble()
                empSys.addEmployee(name, position, salary)
            }
            2 -> {
                print("Enter employee ID to remove: ")
                val id = scanner.nextInt()
                empSys.removeEmployee(id)
            }
            3 -> {
                empSys.printAllEmployees()
            }
            4 -> {
                println("Exiting")
            }
            else -> {
                println("Invalid option, please try again")
            }
        }
    }
}
