import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class jserver {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;

    public jserver(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started. Waiting for clients...");
            socket = server.accept();
            System.out.println("Client connected");
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String data = input.readUTF();
            System.out.println("Data received: " + data);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            close();
        }
    }
    private void close() {
        try {
            if (input != null) input.close();
            if (socket != null) socket.close();
            if (server != null) server.close();
        } catch (IOException e) {
            System.err.println("Error in closing resources: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        jserver server = new jserver(8080);
    }
}


