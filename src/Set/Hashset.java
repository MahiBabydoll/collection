

package Set;

import java.util.HashSet;
public class Hashset {
	

	
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();
	        
	        // Adding elements
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Apple"); // Duplicate, won't be added
	        
	        // Iterating over the set
	        for (String fruit : set) {
	            System.out.println(fruit);
	        }
	    }
	}



