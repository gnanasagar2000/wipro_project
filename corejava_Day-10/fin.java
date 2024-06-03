@FunctionalInterface
interface in { 
    void start();
}

public class fin {
    public static void main(String[] args) {
        in obj = new in() {
            @Override
            public void start() {
                System.out.println("Started");
            }
        };
        obj.start();
    }
}


