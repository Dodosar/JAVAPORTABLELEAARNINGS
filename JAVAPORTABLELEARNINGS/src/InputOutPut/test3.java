package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test3 {
	public static void main(String[] args) throws Exception
	{
	 //—оздаем поток-чтени€-байт-из-файла
	 FileInputStream inputStream = new FileInputStream("d:/data.txt");
	 // —оздаем поток-записи-байт-в-файл
	 FileOutputStream outputStream = new FileOutputStream("d:/result.txt");

	  byte[] buffer = new byte[1000];
	 while (inputStream.available() > 0) //пока есть еще непрочитанные байты
	 {
	  // прочитать очередной блок байт в переменную buffer и реальное количество в count
	  int count = inputStream.read(buffer); 
	  outputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
	 }

	 inputStream.close(); //закрываем оба потока. ќни больше не нужны.
	 outputStream.close();
	}
}


