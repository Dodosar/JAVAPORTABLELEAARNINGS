import java.util.*;
 
public class CollectiomApp {
 
	public static void main(String[] args) {
        
		
		
		 TreeMap<Integer, String> states = new TreeMap<Integer, String>();
         String country  = "Andorra";
        // ������� � ������ ��� ���������
        states.put(10,country);
        states.put(150,country);
        states.put(250,country);
        states.put(457,country);
        states.put(7582,country);
        states.put(123736,country);
        states.put(5,country);
       
        //System.out.printf("� ������ %d ��������� \n", states.size());
         
        states.remove(457,country);
        
        //System.out.println(states.lastKey() + " "); 
        
        for(Map.Entry<Integer, String> item : states.entrySet()){
            
            System.out.printf("����: %d  ��������: %s \n", item.getKey(), item.getValue());
        }

        
        TreeMap<Integer, String> states1 = new TreeMap<Integer, String>();
        String country1  = "USA";
       // ������� � ������ ��� ���������
       states1.put(9,country1);
       states1.put(250,country1);
       states1.put(450,country1);
       states1.put(750,country1);
       states1.put(85555,country1);
       states1.put(88888888,country1);
       states1.put(999999,country1);
      
       //System.out.printf("� ������ %d ��������� \n", states.size());
        
       states.remove(750,country1);
       
       //System.out.println(states1.lastKey() + " "); 
       
       for(Map.Entry<Integer, String> item : states1.entrySet()){
           
           System.out.printf("����: %d  ��������: %s \n", item.getKey(), item.getValue());
       }
       
       TreeMap<Integer, String> states2 = new TreeMap<Integer, String>();
       
       states2.putAll(states);
       states2.putAll(states1);
       
       System.out.println(states2.lastKey() + " main country" + " "); 
       
       for(Map.Entry<Integer, String> item : states2.entrySet()){
           
           System.out.printf("����: %d  ��������: %s \n", item.getKey(), item.getValue());
       }
       
    }
}