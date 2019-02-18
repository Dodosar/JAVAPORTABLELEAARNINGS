package AbstractClass;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Issue8 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String fileName=  reader.readLine();
    	
    	InputStream inStream = new FileInputStream(fileName);
    	
    	while(inStream.available()>0){
    	
       	System.out.print((char)inStream.read());
    	}
    	inStream.close();    	
    	reader.close();
    	System.out.println(); 	    	
    	
    }
}