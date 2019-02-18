package JavaRushLev8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
Номер месяца
*/

public class NumberOfMonth {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String month = reader.readLine();
    	HashMap<String,Integer> Monthes = new HashMap<String,Integer>();
    	Monthes.put("January", 1);
    	Monthes.put("February", 2);
    	Monthes.put("March", 3);
    	Monthes.put("April", 4);
    	Monthes.put("May", 5);
    	Monthes.put("June", 6);
    	Monthes.put("July", 7);
    	Monthes.put("August", 8);
    	Monthes.put("September", 9);
    	Monthes.put("October", 10);
    	Monthes.put("November", 11);
    	Monthes.put("December", 12);
    	
    	for(HashMap.Entry<String, Integer> a : Monthes.entrySet()){
    		String key = a.getKey();
    		if(key.equals(month)){
    			System.out.println(a.getValue());
    			System.out.println(month+ " is " +a.getValue() +" month"); 
    			break;
    		}   

    }
    	
    }
}
