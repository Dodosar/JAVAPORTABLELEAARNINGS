package ToLearnStaticBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) throws IOException {

    	}
    
    static {
        //add your code here - добавьте код тут

			try {
				reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


    }
    
    public static Flyable result;
   

    public static void reset() throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String resultString = reader.readLine();
    	if(resultString.contains("helicopter")){
    		result = new Helicopter();
    		result.fly();
    	}
    	else if(resultString.contains("plane")){
			result = new Plane(Integer.parseInt(reader.readLine()));
    		result.fly();
    	}
    	reader.close();
        //add your code here - добавьте код тут
    }
}
