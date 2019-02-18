package AbstractClass;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Запись в файл с консоли
*/

public class Issue9 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
    	
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	//String fileName = reader.readLine();
    	
    	BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\notes5.txt"));
    	
    	String text;
    	
    	while(true){
    	    text = reader.readLine();
    		wr.write(text);
    		wr.newLine();
    		if(text.equals("exit"))
    		break;
    	}
    	
    	wr.close();
    	
    	reader.close();   	
    	
    }
}
