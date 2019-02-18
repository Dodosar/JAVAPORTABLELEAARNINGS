package JavaRash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level6lectere6EvenOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String stringName = reader.readLine();
        for(int i = 0; i<stringName.length(); i++){
            int a = stringName.charAt(i);
            if(a%2 ==0){
    			even++;
    		}
    		else{
    			odd++;
    		}
        }
        System.out.printf("Even: %d Odd: %d",even,odd);
       
    }
}

