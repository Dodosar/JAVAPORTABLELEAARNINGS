package IssueLevel5Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;



public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        if(input > 150){
        	return;
        }
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
    	BigDecimal factorial = BigDecimal.valueOf(1);
    	if(n<0){
    		factorial = BigDecimal.valueOf(0);
    	}
    	for (int i = 1; i <= n; i++) {
    	    factorial = factorial.multiply(BigDecimal.valueOf(i));
    	}	
    
        return ""+ factorial;
    }
}
