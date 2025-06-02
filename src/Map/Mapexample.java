package Map;

import java.util.HashMap;
import java.util.Map;



public class Mapexample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> fruitsMap = new HashMap<>();

        // Adding key-value pairs to the Map
        fruitsMap.put("Apple", 3);
        fruitsMap.put("Banana", 5);
        fruitsMap.put("Orange", 2);

        // Printing the map
        System.out.println("Fruits map: " + fruitsMap);

        // Accessing a value using its key
        int appleCount = fruitsMap.get("Apple");
        System.out.println("Number of Apples: " + appleCount);

        // Modifying a value associated with a key
        fruitsMap.put("Banana", 10);
        System.out.println("Updated map: " + fruitsMap);

        // Removing a key-value pair
        fruitsMap.remove("Orange");
        System.out.println("Map after removing Orange: " + fruitsMap);

        // Checking if a key exists
        boolean hasMango = fruitsMap.containsKey("Mango");
        System.out.println("Contains Mango? " + hasMango);

        // Iterating over the Map (keys and values)
        System.out.println("Iterating over map:");
        for (Map.Entry<String, Integer> entry : fruitsMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
