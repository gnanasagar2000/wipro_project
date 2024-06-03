public class loops {
    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            if(i == 6) {
                break; 
            }
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Aaryan " + (i+1));
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        table(6);
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}