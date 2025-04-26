//Tabari Harvey, 04/25/2025, Module-8 Programming Assignment
package M8;
import java.util.ArrayList;
import java.util.Scanner;

public class TabariArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Integer largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > largest) {
                largest = list.get(i);
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        //new is instantiating of the ArrayList class
        //Creating the instance of the object
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer input;

        System.out.println("Enter integers to add to the list (enter 0 to stop):");

        do {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != 0);

        Integer largestNumber = max(numbers);

        if (numbers.isEmpty()) {
            System.out.println("The list was empty, the largest value is: " + largestNumber);
        } else {
            System.out.println("The largest value in the list is: " + largestNumber);
        }

// Test with an empty list
        ArrayList<Integer> emptyList = new ArrayList<>();
        Integer largestInEmpty = max(emptyList);
        System.out.println("Largest value in an empty list: " + largestInEmpty);

// Test with a list containing only zero
        ArrayList<Integer> zeroList = new ArrayList<>();
        zeroList.add(0);
        Integer largestInZeroList = max(zeroList);
        System.out.println("Largest value in a list containing only zero: " + largestInZeroList);

        scanner.close();
    }
}

