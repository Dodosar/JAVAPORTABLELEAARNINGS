package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordsBackwords {
	public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> list = new ArrayList();
        for( int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        
        list.remove(2);
        
        for(int i = 0; i < list.size()/2; i++){
            String tmp = list.get(i);
            list.set(i, list.get(list.size()-i-1));
            list.set(list.size()-i-1,tmp);
        }
        
        for(Object a : list){
        	System.out.println(a);
        }
        
    }
}