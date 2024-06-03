import java.util.Comparator;

class Employee {
    public static void main(String[] args)
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int salaryComparison = Double.compare(emp1.getSalary(),emp2.getSalary());
        if (salaryComparison == 0) {
            return emp1.getName().compareTo(emp2.getName());
        }

        return salaryComparison;
    }
}
