package JavaRushLevel6;

import java.util.ArrayList;

public class ArrayListMas {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    	ArrayList<String> list =new ArrayList<String>();
        for(int i = 0; i<5; i ++){
            String tt = "test ";
            list.add(tt);
        }
        
        System.out.println(list.size());
        for(int i = 0; i<4; i++){
            System.out.println(list.get(i));

        } 
    }
}
