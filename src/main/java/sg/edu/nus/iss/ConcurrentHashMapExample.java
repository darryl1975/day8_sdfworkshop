package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void example() {
        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer", 5);
        laptops.put("Apple", 10);
        laptops.put("MSI", 10);
        laptops.put("Asus", 15);

        // get the total size of the map objects
        System.out.println("Total laptops: " + laptops.size());

        // iterate through the Map (laptops), use keySet method
        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "Asus";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) laptops).elements();
        while(elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        Integer retValue = laptops.putIfAbsent("Apple", 25);
        if (retValue != null) {
            System.out.println("Item found: " + retValue);
        }

        searchString = "Apple";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        retValue = laptops.putIfAbsent("Microsoft", 18);

        // laptops.put("Microsoft", null);
        // laptops.put(null, 6);
        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }
    }
}
