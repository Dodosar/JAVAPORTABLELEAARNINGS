package JavaRushLev8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class CountOFPairs {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap listName = new HashMap();
        listName.put("Dima","Tiurin");
        listName.put("Sergey","Tiurin");
        listName.put("Kate","Tiurin");
        listName.put("Dimon","Muranoch");
        listName.put("Sergega","Muranoch");
        listName.put("Katerina","Muranoch");
        listName.put("Tolik","Djon");
        listName.put("Vova","Djon");
        listName.put("Saha","Mongomery");
        listName.put("Sahsa","Tiurin");
        return listName;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(HashMap.Entry  a : map.entrySet()){
            if(a.getKey()==name){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(HashMap.Entry  a : map.entrySet()){
            if(a.getValue()==lastName){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    	System.out.println(getCountTheSameFirstName(createMap(),"Dima"));
    	System.out.println(getCountTheSameLastName(createMap(),"Tiurin"));
    }
}