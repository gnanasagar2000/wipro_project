import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class jclient {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;
    private Scanner scanner = new Scanner(System.in);
    
    public jclient(String addr, int port) {
        try {
            socket = new Socket(addr, port);
            System.out.println("Connected to server");
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            close();
        }
    }
    public String takeInput() {
        System.out.print("Enter your message: ");
        return scanner.nextLine();
    }
    public void sendMessage(String msg) {
        try {
            output.writeUTF(msg);
            System.out.println("Message sent to server: " + msg);
        } catch (IOException e) {
            System.err.println("Failed to send message: " + e.getMessage());
            close();
        }
    }
    private void close() {
        try {
            if (input != null) input.close();
            if (output != null) output.close();
            if (socket != null) socket.close();
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error in closing resources: " + e.getMessage());
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        jclient client = new jclient("127.0.0.1", 8080);

        while (true) {
            System.out.println("1. Send Message");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = client.scanner.nextInt();

            switch (choice) {
                case 1:
                    String message = client.takeInput();
                    client.sendMessage(message);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    client.close();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


