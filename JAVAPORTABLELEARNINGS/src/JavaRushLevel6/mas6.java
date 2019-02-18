package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mas6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] mas = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i <mas.length; i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }
        
        int countEven = 0;
        int countOdd = 0;
        for( int i = 0; i<mas.length; i++){
        	
            if(i%2 == 0 || i == 0){
            	countEven+=mas[i];
            }
            else{
                countOdd+=mas[i];
            }
           
        }
        if(countOdd>countEven){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
            System.out.println(countOdd);
        }
        else{
            System.out.println("В домах с четными номерами проживает больше жителей.");
            System.out.println(countEven);
        }
    }
}