package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mas5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[20];
        
        for(int i = 0; i < mas.length; i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }
        
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        
        for(int i = 0; i<mas.length/2; i++){
            mas1[i] = mas[i];
        }
        for(int i = 0; i<mas2.length; i++){
        	mas2[i] = mas[mas.length/2+i];
        }
        for(int i = 0; i<mas2.length; i++){
            System.out.println(mas2[i]);
        }
    }
}
