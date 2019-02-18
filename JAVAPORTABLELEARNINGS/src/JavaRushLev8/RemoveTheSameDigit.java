package JavaRushLev8;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class RemoveTheSameDigit {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400); 
        map.put("i", 500); 
        map.put("z", 600);
        map.put("f", 700);
        map.put("g", 800);
        map.put("h", 900);
        map.put("j", 1000);
        return map;
        
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copymap =new HashMap<String, Integer>(map);
        for(Map.Entry<String,Integer> a : copymap.entrySet()){
        	System.out.println(a.getKey() + " - " + a.getValue());
                  if(a.getValue() < 500){
                	  map.remove(a.getKey());                 
            }
        }
        
        for(Map.Entry<String, Integer> c: map.entrySet()){
        	System.out.println(c.getKey() + " - " + c.getValue());
        }
        
    }

    public static void main(String[] args) {
    	removeItemFromMap(createMap());
    	
    }
}