package StackTrace;

public class ExceptionArrays {
	public static void main(String[] args) throws Exception {
        //напишите тут ваш код
		try
		{
        int[] m = new int[2];
        m[8] = 5;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
        //напишите тут ваш код
    }
}
