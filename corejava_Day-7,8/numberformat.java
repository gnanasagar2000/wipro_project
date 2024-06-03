public class numberformat {
    public static void main(String[] args) {
        String str = "abc"; 
        try {
           
            int num = Integer.parseInt(str);
            System.out.println("Parsed integer: " + num);
        } catch (NumberFormatException e) {
           
            System.out.println("Error: The string is not a valid integer.");
        }
    }
}