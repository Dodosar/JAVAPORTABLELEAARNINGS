package StackTrace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class VowelsAndConsonants {
	 public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

	    public static void main(String[] args) throws Exception {
	        //�������� ��� ��� ���
	    	String a1 ="";
	    	String b1 ="";
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	String text = reader.readLine().replaceAll(" ","");
	    	char[] splitText = text.toCharArray();
	    	//System.out.println("������ � ������ ��������: " + Arrays.toString(splitText));
	    	for(char a : splitText){	    		
	    		if(isVowel(a) == true){
	    			a1 +=String.valueOf(a+" ");
	    		}
	    		else{
	    			b1 +=a+" ";
	    		}
	    	}
	    	
	    	System.out.println(a1);
	    	System.out.println(b1);

	    }

	    // ����� ���������, ������� �� �����
	    public static boolean isVowel(char c) {
	        c = Character.toLowerCase(c);  // �������� ������ � ������ ������� - �� ��������� � �������� ������

	        for (char d : vowels)   // ���� ����� ������� �������
	        {
	            if (c == d)
	                return true;
	        }
	        return false;
	    }
}