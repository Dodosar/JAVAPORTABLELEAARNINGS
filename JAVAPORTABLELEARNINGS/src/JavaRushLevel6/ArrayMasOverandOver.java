package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
�����-�����
*/

public class ArrayMasOverandOver {
	 public static void main(String[] args) throws Exception {
		 //�������� ��� ��� ��� 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 ArrayList<String> list = new ArrayList<>();
		 int max=0;
		 int min=0;
		 for (int i=0;i<10;i++){
			 list.add(reader.readLine());
			 } 
		 for (int i=0;i<10;i++){
			 if (list.get(i).length() < list.get(min).length()){
				 min = i;
				 }
			 if (list.get(i).length() > list.get(max).length()){
				 max = i;
				 }
			 }
		 System.out.println(list.get(Math.min(min,max)));
	 }
}