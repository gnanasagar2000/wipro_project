import java.util.List;
import java.util.ArrayList;

public class secondelement {
    public static void main(String[] args) {
        // Example list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Pineapple");

        System.out.println("Original List: " + fruits);
        removeEverySecondElement(fruits);
    }

    public static void removeEverySecondElement(List<String> list) {
        List<String> modifiedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // Add every first element and skip every second element
            if (i % 2 == 0) {
                modifiedList.add(list.get(i));
            }
        }

        System.out.println("Modified List: " + modifiedList);
    }
}