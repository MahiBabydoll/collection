package Set;

import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {		   
		  TreeSet<String> set = new TreeSet<>();
		        set.add("Banana");
		        set.add("Apple");
		        set.add("Orange");
		        
		        // Iterating over the set
		        for (String fruit : set) {
		            System.out.println(fruit);
		        }
		    }
}
