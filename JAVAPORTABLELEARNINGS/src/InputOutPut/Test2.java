package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
	public static void main(String[] args) throws Exception
	{
	 //������� �����-������-����-��-�����
	 FileInputStream inputStream = new FileInputStream("d:/data.txt");
	 // ������� �����-������-����-�-����
	 FileOutputStream outputStream = new FileOutputStream("d:/result.txt");

	 while (inputStream.available() > 0) //���� ���� ��� ������������� �����
	 {
	  int data = inputStream.read(); // ��������� ��������� ���� � ���������� data
	  outputStream.write(data); // � �������� ��� �� ������ �����
	 }

	 inputStream.close(); //��������� ��� ������. ��� ������ �� �����.
	 outputStream.close();
	}
}
