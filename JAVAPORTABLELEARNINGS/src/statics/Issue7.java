package statics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
������ ������ ��� ������ �����
*/

public class Issue7 {
    public static void main(String[] args) throws IOException {
        //������� ��� ��� ���
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	boolean Valid = true;
    	while(Valid){
    		String value = reader.readLine();
    		
    		try{
    		if(value.contains("exit")){
    			Valid = false;
    			break;    			
    		}
    		else if(value.contains(".")){    			
    			print(Double.parseDouble(value));
    		}
    		else if(Integer.parseInt(value)>0 && Integer.parseInt(value)<128){
    			print(Short.parseShort(value));
    		}    		
    		else{
    			print(Integer.parseInt(value));
    		}
    		}
    		catch(Exception e){
    			print(value);    		
    		}
    		}
    	}
    

    public static void print(Double value) {
        System.out.println("��� ��� Double, �������� " + value);
    }

    public static void print(String value) {
        System.out.println("��� ��� String, �������� " + value);
    }

    public static void print(short value) {
        System.out.println("��� ��� short, �������� " + value);
    }

    public static void print(Integer value) {
        System.out.println("��� ��� Integer, �������� " + value);
    }
}
