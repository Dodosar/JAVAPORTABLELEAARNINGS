package StackTrace;

public class ExceptionInteger {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
    	try
    	{
        int num = Integer.parseInt("XYZ");
        System.out.println(num);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println(e);
    	}
        //�������� ��� ��� ���
    }
}
