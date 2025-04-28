//Tabari Harvey, 04/25/2025, Module-9 Programming Assignment
import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Step 1: Create and fill ArrayList
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Elderberry");
        words.add("Fig");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");

        // Step 2: Print using for-each
        System.out.println("Here are the words in the list:");
        for (String word : words) {
            System.out.println(word);
        }

        // Step 3: Ask user for an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which item (0-9) would you like to see again? ");
        String userInput = scanner.nextLine(); // Input as string
        Integer index = Integer.parseInt(userInput); // Auto-unboxing happens here

        // Step 4: Try/catch to access item
        try {
            String selected = words.get(index); // may throw IndexOutOfBoundsException
            System.out.println("You selected: " + selected);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}
