package JavaRushLev8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Rama {
    public static void main(String[] args) throws IOException {
    	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	 String s = reader.readLine();
    	 String str = ""; 
    	 for (int i = 0; i < s.length(); i++) {
    		 if (str.equals(" ") || str.equals("")) 
    			 System.out.print(s.substring(i, i+1).toUpperCase()); 
    		 else
    			 System.out.print(s.substring(i, i+1));
    		 	 str = s.substring(i, i+1);
    		 	 }
    	 }
}
    	
    
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine(); 
        
 		String[] phrasa = s.split(" ");
 		 for (String x: phrasa ) {
 		  if (x.length() > 1){
 		   x = x.substring(0, 1).toUpperCase() + x.substring(1);
 		    System.out.print(x + " ");
 		     }
 		      }
 		      */

