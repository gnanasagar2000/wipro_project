public class methods {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void task() {
        System.out.println("Task 1 started");
        System.out.println("Task1 completed");
    }
    public int product(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Result: " + sum(a, b));
        task();
        methods obj = new methods();
        System.out.println("Product: " + obj.product(a, b));
    }
}