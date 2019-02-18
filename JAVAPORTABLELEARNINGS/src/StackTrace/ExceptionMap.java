package StackTrace;

import java.util.HashMap;


public class ExceptionMap {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    	try
    	{
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
    	}
    	catch(NullPointerException e)
    	{
    		System.out.println(e);
    	}
        //напишите тут ваш код
    }
}
