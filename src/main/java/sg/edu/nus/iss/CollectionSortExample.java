package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    
    public void example01() {
        List<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 0; i < 10; i++) 
            numbers.add((int) (Math.random() * 100));

        // print out unsorted list
        System.out.print("Unsorted list: " + numbers);

        // Sort in ascending
        Collections.sort(numbers);

        // print out the sorted list
        System.out.println("Sorted list: " + numbers);

        // Sort in descending
        Collections.sort(numbers, Collections.reverseOrder());

        // print out the sorted list
        System.out.println("Sorted list (reverse): " + numbers);
    }
}
