package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) throws Exception
	{		
	 
	 FileInputStream inputStream = new FileInputStream("d:/data.txt");

	 //������� ������ FileInputStream, ����������� � ����� �c:/data.txt�.	 
	 long sum = 0;

	 while (inputStream.available() > 0) //���� �������� ������������� �����
	 {
	  int data = inputStream.read(); //��������� ��������� ����
	  sum += data; //�������� ��� � ����� ����� 
	 }
	 inputStream.close(); // ��������� �����

	 System.out.println(sum); //������� ����� �� �����. 
	}
}
