package StackTrace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class VowelsAndConsonants {
	 public static char[] vowels = new char[]{'а', '€', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'Є'};

	    public static void main(String[] args) throws Exception {
	        //напишите тут ваш код
	    	String a1 ="";
	    	String b1 ="";
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	String text = reader.readLine().replaceAll(" ","");
	    	char[] splitText = text.toCharArray();
	    	//System.out.println("—троку в массив символов: " + Arrays.toString(splitText));
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

	    // метод провер€ет, гласна€ ли буква
	    public static boolean isVowel(char c) {
	        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

	        for (char d : vowels)   // ищем среди массива гласных
	        {
	            if (c == d)
	                return true;
	        }
	        return false;
	    }
}