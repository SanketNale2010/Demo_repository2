package Task;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Double> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5.99);
        numbers.add(2.99);
        numbers.add(8.23);
        numbers.add(1.56);
        numbers.add(6.99);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList (Ascending Order): " + numbers);
    }
}
