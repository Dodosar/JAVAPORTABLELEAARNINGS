package AbstractClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class Issue16 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	//String fileName = reader.readLine();
    	BufferedReader readeFile = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\notes5.txt")));
    	
    	TreeSet<Integer> list = new TreeSet<Integer>();
    	
    	while(readeFile.ready())
    	{	
    		int data = Integer.parseInt(readeFile.readLine());   
    		list.add(data); 
    	}
    	for(Integer c : list){
    		if(c%2==0){
    			System.out.println(c);
    		}
    	}
    	readeFile.close();
    	reader.close();
    
}
    }
    

