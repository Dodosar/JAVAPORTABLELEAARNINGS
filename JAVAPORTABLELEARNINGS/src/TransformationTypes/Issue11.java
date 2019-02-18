package TransformationTypes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/* 
Количество букв
*/

public class Issue11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine().replaceAll(" ", "");
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код 
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i<abcArray.length; i++){
        	map.put(abcArray[i],0);
        }
        
        
        for(String a : list){
        	char[] listChar =  a.toCharArray();
        	for(char c : listChar){
        		for(Entry<Character, Integer> b : map.entrySet()){
        			if(c == b.getKey()){
        				b.setValue(b.getValue()+1);
           			}        			
        		}        		
        	}
        	
        }
        for (int i = 0; i < abcArray.length; i++) {
        	System.out.println(abcArray[i] + " " + map.get(abcArray[i]));
        }
        
    }

}