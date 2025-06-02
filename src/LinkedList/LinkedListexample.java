package LinkedList;
import java.util.LinkedList;

public class LinkedListexample {
	


	    public static void main(String[] args) {
	        // Create a LinkedList
	        LinkedList<String> animals = new LinkedList<>();

	        // Add elements
	        animals.add("Dog");
	        animals.add("Cat");
	        animals.addFirst("Horse");  // Adds at the beginning
	        animals.addLast("Cow");     // Adds at the end

	        // Access elements
	        System.out.println("First element: " + animals.getFirst());  // Horse
	        System.out.println("Last element: " + animals.getLast());    // Cow

	        // Remove elements
	        animals.remove(2);  // Removes "Cat"
	        System.out.println("After removal: " + animals);

	        // Stack operations
	        animals.push("Lion");  // Adds at the beginning
	        System.out.println("After push: " + animals);
	        String popped = animals.pop();  // Removes the first element
	        System.out.println("After pop: " + animals);
	    }
	}


