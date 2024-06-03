import java.util.*;

public class map {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana mango orange";

        String[] wordsArray = text.split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : wordsArray) {
            if (wordFrequencyMap.containsKey(word)) {
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}