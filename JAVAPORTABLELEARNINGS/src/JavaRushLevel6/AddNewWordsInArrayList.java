package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class AddNewWordsInArrayList {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");
        
        for(int i = 1; i <= list.size(); i++){
        	list.add(i++, "именно");
        
        }
        
        for(Object a : list){
            System.out.println(a);
        }
    }
}

