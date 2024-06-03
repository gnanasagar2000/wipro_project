import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
    
        File f = new File("./names1.txt");
        try {
            boolean created = f.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
            f.deleteOnExit(); 
            FileWriter fw = new FileWriter(f);
            fw.append("Aaryan is a Trainer");
            fw.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while performing file operations: " + e.getMessage());

             e.printStackTrace();
        }
    }
}