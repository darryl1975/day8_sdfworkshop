package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public void example() {
        // custom array with data (name)
        String name[] = { "darryl", "elaine", "james", "zoanne", "chris", "mark", "sophia", "asher", "brandon", "helen", "daniel", "marcus" };

        // print out unsorted array
        System.out.println("Unsorted arr: " + Arrays.toString(name));

        // sort the array in ascending order
        Arrays.sort(name);

        // print out sorted array
        System.out.println("Sorted arr: " + Arrays.toString(name));

        // sort array in descending order
        Arrays.sort(name, Collections.reverseOrder());

        // print out the sorted array
        System.out.println("Sorted arr (reverse): " + Arrays.toString(name));
    }

    public void example2() {
        Integer numbers[] = {10, 5, 1, 2, 4, 3,6, 7, 9, 8};
        // int[] numbers = {10, 5, 1, 2, 4, 3,6, 7, 9, 8};

        // sort number array in ascending order
        Arrays.sort(numbers);

        // print out the sorted number array
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // sort number array in reverse order
        Arrays.sort(numbers, Collections.reverseOrder());

        // print out the sorted number array
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }
}
