public class conditional {
    public boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
       
        @SuppressWarnings("unused")
        boolean b = 2 > 3;
        b = 2 == 3;
        b = 2 >= 1;
        b = 3 != 6;

        b = (2 > 1) && (3 < 4); 
        b = (2 > 3) || (4 < 5); 
        b = (2 > 3) || (4 > 5);

        int a = 6;
        int c = 6;

        if(a < c) {
            System.out.println("ok");
        } else if(a == c) {
            System.out.println("both are equal");
        } else {
            System.out.println("no");
        }

        conditional c1 = new conditional();
        c1.isEligible(19);
    }
}