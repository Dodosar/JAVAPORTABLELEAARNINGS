package Collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2){
				return 0;
			}
		});
		
		set.add(1);
		set.add(2);
		System.out.println(set);
		
		Set<String> fruit = new HashSet();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("banana");
		
		System.out.println(fruit.size());
		System.out.println(fruit);
		
		
		//iterator
	    var i = fruit.iterator();
	    while(i.hasNext())
	        System.out.println(i.next());
	    
	    
		//Enhanced For Loop
	    for(String item : fruit){
	        System.out.println("this is for loop " + item);
	    }
		
	    
	    //forEach  On our collection, we can do a call
	    //to forEach() and this for each will take a lambda expression.
	    
	    fruit.forEach(x -> System.out.println("Lambda " + x));
	    
	    // :
	    
	    fruit.forEach(System.out::println);
	    
	    
       
	}
		
	}

