import java.util.*;

public class set {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana mango orange";
        String[] wordsArray = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        for (String word : wordsArray) {
            uniqueWords.add(word);
        }
        System.out.println("Number of unique words: " + uniqueWords.size());
    }
}