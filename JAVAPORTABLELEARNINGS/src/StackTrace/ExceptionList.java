package StackTrace;

import java.util.ArrayList;

public class ExceptionList {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
    	try
    	{
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
    	}
    	catch (IndexOutOfBoundsException e){
    		System.out.println(e);
    	}
        //�������� ��� ��� ���
    }
}