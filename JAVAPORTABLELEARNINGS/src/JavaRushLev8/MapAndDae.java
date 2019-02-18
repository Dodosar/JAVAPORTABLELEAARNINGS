package JavaRushLev8;


import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class MapAndDae {
    @SuppressWarnings("deprecation")
	public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Shvars", new Date("JULY 1 1981"));
        map.put("Vandam", new Date("August 1 1982"));
        map.put("JekiChan", new Date("September 1 1983"));
        map.put("BrusLee", new Date("October 1 1984"));
        map.put("BredliKuper", new Date("November 1 1985"));
        map.put("VinDeasel", new Date("December 1 1986"));
        map.put("SharonStone", new Date("January 1 1987"));
        map.put("Trump", new Date("February 1 1988"));
        map.put("Putin", new Date("March 1 1989"));
        //напишите тут ваш код
        
        for(HashMap.Entry a: map.entrySet()){
        	System.out.println(a);
        }
        return map;
    }

    @SuppressWarnings("deprecation")
	public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
    	HashMap<String, Date> copyMap = (HashMap) map.clone();
    	for(HashMap.Entry a : map.entrySet()){
    		Date date = (Date) a.getValue();
    		int Month = date.getMonth();
    		System.out.println("Month " +Month);
    		if(Month>4 & Month<8){
    			copyMap.remove(a.getKey());
    		}
    	}
    	/* HashMap<String, Date> newMap = new HashMap();
        for (HashMap.Entry pair : map.entrySet()) {
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8) 
            newMap.put(pair.getKey(), pair.getValue());
            } 
            for (HashMap.Entry pair : newMap.entrySet()){
                map.remove(pair.getKey());
                } 
                }
                */
    	
    	
    	for(HashMap.Entry a: copyMap.entrySet())
    	{
    	System.out.println("CopyMap: " +a);
    }
    }

    public static void main(String[] args) {
    	//System.out.println(createMap());
    	removeAllSummerPeople(createMap());
    }
}
