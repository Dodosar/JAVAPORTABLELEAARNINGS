package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test3 {
	public static void main(String[] args) throws Exception
	{
	 //������� �����-������-����-��-�����
	 FileInputStream inputStream = new FileInputStream("d:/data.txt");
	 // ������� �����-������-����-�-����
	 FileOutputStream outputStream = new FileOutputStream("d:/result.txt");

	  byte[] buffer = new byte[1000];
	 while (inputStream.available() > 0) //���� ���� ��� ������������� �����
	 {
	  // ��������� ��������� ���� ���� � ���������� buffer � �������� ���������� � count
	  int count = inputStream.read(buffer); 
	  outputStream.write(buffer, 0, count); //�������� ����(����� �����) �� ������ �����
	 }

	 inputStream.close(); //��������� ��� ������. ��� ������ �� �����.
	 outputStream.close();
	}
}


