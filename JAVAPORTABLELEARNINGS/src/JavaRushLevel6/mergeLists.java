package JavaRushLevel6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class mergeLists {
	public static void main(String[] args) throws IOException
	{
	    ArrayList list1 = new ArrayList();   //�������� ������  
	    Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //���������� ������

	    ArrayList list2 = new ArrayList();
	    Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

	    ArrayList<Integer> result = new ArrayList();

	    result.addAll(list1);   //���������� ���� �������� �� ������ ������ � ������
	    result.addAll(list2);

	    for (Integer x : result)   //������� for �� ���� ���������, ������ ��� ���������
	    {
	        System.out.println(x);
	    }
	}
}
