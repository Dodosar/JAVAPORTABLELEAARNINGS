package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
	public static void main(String[] args) throws Exception
	{
	 //—оздаем поток-чтени€-байт-из-файла
	 FileInputStream inputStream = new FileInputStream("d:/data.txt");
	 // —оздаем поток-записи-байт-в-файл
	 FileOutputStream outputStream = new FileOutputStream("d:/result.txt");

	 while (inputStream.available() > 0) //пока есть еще непрочитанные байты
	 {
	  int data = inputStream.read(); // прочитать очередной байт в переменную data
	  outputStream.write(data); // и записать его во второй поток
	 }

	 inputStream.close(); //закрываем оба потока. ќни больше не нужны.
	 outputStream.close();
	}
}
