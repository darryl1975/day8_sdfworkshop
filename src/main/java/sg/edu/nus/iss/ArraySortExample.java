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
}
