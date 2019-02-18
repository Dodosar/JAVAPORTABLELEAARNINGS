package StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class MethodTryCatch {
    public static void main(String[] args) {
    	readData();

    }

    public static void readData() {
        //напишите тут ваш код
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	List<Integer> array = new ArrayList();
    	while(true){
    	try{   	
    	int a = Integer.parseInt(reader.readLine());
    	array.add(a);    	
    	}
    	catch (Exception e){
    			
    		 for(Integer i :array){
    			 System.out.println(i);
    		 }
    		 System.out.println(e);
    		 break;
    	}
    	}
    }
}
