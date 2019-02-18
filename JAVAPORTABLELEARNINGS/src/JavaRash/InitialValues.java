package JavaRash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;


public class InitialValues {
	 public static void main(String[] args) throws Exception {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		 int n = Integer.parseInt(reader.readLine());
		 int a[]; a = new int[n];
		 for (int i = 0; i < n; i++) {
			 a[i] = Integer.parseInt(reader.readLine());
			 } 
		 int max = 0;
		 //сортировка: проходим массив n раз. 
		 for (int i = 0; i < n; i++) {
			 //берем элемент и если он с соседним стоит не правильно, то меняем местами 
			 for (int j = n - 1; j > i; j--) {
				 if (a[j] < a[j - 1]) {
					 int temp = a[j];
					 a[j] = a[j - 1];
					 a[j - 1] = temp;
					 } 
				 } 
			 }
		 max = a[n - 1];
		 System.out.println(max);
		 }
	 }
	