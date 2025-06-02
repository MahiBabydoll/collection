package Set;

import java.util.LinkedHashSet;
public class LinkedHashset {
	

	
	    public static void main(String[] args) {
	        LinkedHashSet<String> set = new LinkedHashSet<>();
	        
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        
	        System.out.println(set);
	        // Iterating over the set
	        for (String fruit : set) {
	            System.out.println(fruit);
	        }
	    }
	}



