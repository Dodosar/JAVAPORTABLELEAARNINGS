package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayAddNewString {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i =0; i < 5; i++){
            list.add(reader.readLine());
        }
        
        for(int i = 0; i < 13; i++){
            String s = list.get(4);
            list.remove(4);
            list.add(0,s);
        }
        
        for(Object a : list){
            System.out.println(a);
        }
        }
}