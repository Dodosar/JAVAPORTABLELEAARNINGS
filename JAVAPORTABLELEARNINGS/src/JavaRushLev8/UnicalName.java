package JavaRushLev8;


import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class UnicalName {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("a", "d");
        map.put("b", "d");
        map.put("c", "d");
        map.put("d", "d"); 
        map.put("i", "i"); 
        map.put("z", "i");
        map.put("f", "o");
        map.put("g", "o");
        map.put("h", "o");
        map.put("j", "p");
        return map;
        }
    
    /*public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String,String> ret = new HashMap(map);
        for (String unical: ret.values()) {
            for (String name:map.values()){
                if (name.equals(unical)) 
                	removeItemFromMapByValue(map,unical);
                
            }
        }
    }*/
    public static void removeTheFirstNameDuplicates(HashMap < String, String > map) {
        HashMap < String, String > temp = new HashMap(map);
        for (Map.Entry < String, String > a : temp.entrySet()) {
            for (Map.Entry < String, String > b : temp.entrySet()) {
                if (a.getValue().equals(b.getValue()) && !a.getKey().equals(b.getKey())) 
                { removeItemFromMapByValue(map, a.getValue());
                }
                }
                } 
        
    }
    

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
