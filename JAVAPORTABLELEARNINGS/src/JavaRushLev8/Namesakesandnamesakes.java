package JavaRushLev8;


import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Namesakesandnamesakes {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
    	HashMap<String, String> map = new HashMap<String,String>();
    	map.put("Name", "SurName1");
    	map.put("Name", "SurName1");
    	map.put("Name1", "SurName2");
    	map.put("Name2", "SurName2");
    	map.put("Name3", "SurName3");
    	map.put("Name4", "SurName3");
    	map.put("Name5", "SurName4");
    	map.put("Name5", "SurName4");
    	map.put("Name6", "SurName5");
    	map.put("Name7", "SurName5");
    	
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
