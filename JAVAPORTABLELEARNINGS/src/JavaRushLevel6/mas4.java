package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class mas4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intmas = new int[9];
         
        for(int i = 0; i<intmas.length; i++){
             intmas[i] = Integer.parseInt(reader.readLine());
            }
        for (int i = 0; i < intmas.length/2; ++i){
            int tmp = intmas[i];
            intmas[i] = intmas[intmas.length-i-1];
            intmas[intmas.length-i-1] = tmp;
            }
         
        for(int i = 0; i <intmas.length; i++){
            System.out.println(intmas[i]);
        }
    }
}
