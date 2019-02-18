package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArraysMasMax {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i<5; i++){
            list.add(reader.readLine()); 
        }
        int strLength = Integer.MIN_VALUE;
        //ArrayList<Integer> list1= new ArrayList<Integer>();
        
        for(int i = 0; i<list.size(); i++){
            String s = list.get(i);
            int len = s.length();            
            if(strLength<len){
            	strLength = len;
            }

        }
        
        for (int i = 0; i < list.size(); i++) {
        	if (list.get(i).length() == strLength) System.out.println(list.get(i)); }
    }
}

