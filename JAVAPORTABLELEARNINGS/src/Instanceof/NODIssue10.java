package Instanceof;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class NODIssue10 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		try {
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			if ((a <= 0) || (b<= 0)) {
				throw new Exception();
			}
			/*int temp = 0;
			for (int j = 1;j<=a; j++) {
				if (a % j == 0 && a1 % j == 0) {
					temp = j;
				}
			}
			System.out.println(temp);*/			
			System.out.println(nod(a,b)); 
			
		}
			/*    ��� ��� ������. � ������ nod ����������� ����� ��� 
			 *    �� ��������� �������, ������� ������������ �� ���,
			 *     ��� ���� ��� ����� ��� ������� �� �����-���� �����,
			 *      �� �� �������� ���� ������� �� ��� �����.
			 *       �� ���� � ���� ����� a � b ������� �� ����� �������� 
			 *       �� ��������� �� ��� ���, ���� ����� �� ������ �������.
			 *        � ����� ��� ����� �������� ��� 
			 */
			
		catch (NumberFormatException e) {
				e.getMessage();
				System.out.println("Error");
			}
		
		}

	public static int nod (int a, int b){ 
		while (a != b) 
		{ if (a > b){
		a = a - b; }
		else {b = b - a; 
		} 
		}
		return a;
		}
	}
	

