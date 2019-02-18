package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Massive2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] massive = new String[10];
       // System.out.println(massive.length);
        for(int i = 0; i< massive.length-2; i++){
        	//massive[i] = i + 1;
            massive[i] = reader.readLine();
        	}
        
        for(int k = 9; k >= 0; k--){
            System.out.println(massive[k]);
        }
    }
}

