package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class mas3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intmas = new int[10];
        String[] strmas = new String[10];
        
        for(int i = 0; i<strmas.length; i++){
            strmas[i] = reader.readLine();
        }
        
        for(int k = 0; k<intmas.length; k++){
            for(int i = 0; i<=k; i++){
                String a = strmas[i];
                int b = a.length();
                intmas[k] = b;
            }
            
        }
        
        for(int i = 0; i<intmas.length; i++){
        	System.out.println(intmas[i]);
        }
    }
}