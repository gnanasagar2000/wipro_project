public class constructor {
    
    constructor() {
        System.out.println("Object created");
    }
    constructor(int a) {
        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        constructor c = new constructor(5); 
    }
}