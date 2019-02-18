package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) throws Exception
	{		
	 
	 FileInputStream inputStream = new FileInputStream("d:/data.txt");

	 //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».	 
	 long sum = 0;

	 while (inputStream.available() > 0) //пока остались непрочитанные байты
	 {
	  int data = inputStream.read(); //прочитать очередной байт
	  sum += data; //добавить его к общей сумме 
	 }
	 inputStream.close(); // закрываем поток

	 System.out.println(sum); //выводим сумму на экран. 
	}
}
