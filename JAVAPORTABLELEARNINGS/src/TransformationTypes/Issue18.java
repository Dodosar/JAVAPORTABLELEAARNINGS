package TransformationTypes;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Issue18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> list = new HashMap<String,Integer>();
        while(true)
        try{
        int id = Integer.parseInt(reader.readLine());      
        String name = reader.readLine();
        list.put(name,id);
        }
        catch(NumberFormatException e){
        	break;
        }
        
       
        for(Map.Entry<String,Integer> a :list.entrySet()){
        	System.out.println(a.getValue() + " " + a.getKey());
        }
    }
}
