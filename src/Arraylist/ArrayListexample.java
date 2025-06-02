package Arraylist;

import java.util.ArrayList;

public class ArrayListexample {

	public static void main(String[] args) {
		

		
		        // Create an ArrayList
		        //ArrayList<String> fruits = new ArrayList<>();
		        ArrayList<String> fruits =new ArrayList<>();
		        

		        // Add elements to the ArrayList
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");
		        fruits.add("mango");
		        // Print the ArrayList
		        System.out.println("Fruits: " + fruits);

		        // Access an element
		        String firstFruit = fruits.get(0);
		        System.out.println("First fruit: " + firstFruit);

		        // Remove an element
		        fruits.remove("Banana");
		        System.out.println("After removing Banana: " + fruits);

		        // Size of the ArrayList
		        int size = fruits.size();
		        System.out.println("Number of fruits: " + size);
		    }
		


	}


