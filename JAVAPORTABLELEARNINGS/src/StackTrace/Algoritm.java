package StackTrace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
������ �� ����������
*/

public class Algoritm {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //�������� ��� ��� ���
    	for(int i = 0; i < array.length-1; i++){
    		if(isNumber(array[i]) == true){
    		for(int j = i+1; j < array.length; j++){  
    			if(isNumber(array[j]) == true){
    				if(Integer.parseInt(array[j])>Integer.parseInt(array[i])){
    					String temp = array[i];
    					array[i] = array[j];
    					array[j] = temp;
    				}
    			}
    			else{
    				continue;
    			}
    		}
    	}
    		else{
    			for(int j = i+1; j < array.length; j++){
    				if(isNumber(array[j]) == true){
    					continue;
    				}
    				else{
    					if(isGreaterThan(array[i], array[j])){
    						String temp = array[j];
        					array[j] = array[i];
        					array[i] = temp;
    					}
    				}
    			}
    		}
    	}
    	
    }

    // ����� ��� ��������� �����: '�' ������ ��� 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // ���������� ������ - ��� �����?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // ���� '-' ������ ������
                    || (!Character.isDigit(c) && c != '-')) // �� ����� � �� ���������� � '-'
            {
                return false;
            }
        }
        return true;
    }
}
