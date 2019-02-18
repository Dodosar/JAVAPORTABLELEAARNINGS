package JavaRash;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class max
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        
        int N = Integer.parseInt(reader.readLine());
        if(N>0){
        	int[]massiv = new int[N];
        	for(int i = 0; i<massiv.length; i++){
        		int a = Integer.parseInt(reader.readLine());
        		massiv[i] = a;
        		if(massiv[i]>maximum){
        			maximum = massiv[i];
        		}        		
        	}        	
        }

        
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
