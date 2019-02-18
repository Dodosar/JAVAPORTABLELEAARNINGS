package JavaRushLevel6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Lev7lec123 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        int[] list = new int[20];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        
        for(int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        
        for(int i = 0; i < list.length; i++){
            if(maximum< list[i]){
                maximum = list[i];
            }
            if(minimum> list[i]){
                minimum = list[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}

