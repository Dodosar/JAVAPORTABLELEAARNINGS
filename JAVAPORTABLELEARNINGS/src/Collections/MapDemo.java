package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Map<String,Integer> fruitCalories = new HashMap();
		    fruitCalories.put("apple", 95);
		    fruitCalories.put("lemon", 20);
		    fruitCalories.put("banana", 105);
		    fruitCalories.put("orange", 45);
		    fruitCalories.put("lemon", 17);
		    
		    for(var entry : fruitCalories.entrySet()){
		        System.out.println(entry.getValue());
		    }
		    
		    //forEach
		    
		    fruitCalories.forEach(
		    	    (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));

	}

}
