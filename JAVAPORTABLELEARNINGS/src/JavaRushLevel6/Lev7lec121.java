package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Вывести числа в обратном порядке
*/

public class Lev7lec121 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        
        for(int i = 0; i<10; i++){
        	list[i] = Integer.parseInt(reader.readLine());
        }
        
        for(int i = 0; i < list.length/2; i++){
            int tmp = list[i];
            list[i] = list[list.length-i-1];
            list[list.length-i-1] = tmp;
        }
        
        for(Object a : list){
        	System.out.println(a);
        }

        //напишите тут ваш код
    }
}