package JavaRushLev8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
����������� �� N �����
*/

public class MinFromNDigits {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here � ����� ������� ���
    	int min = Integer.MAX_VALUE;
    	for(Integer a : array){
    		if(min>a){
    			min = a;
    		}
    	}
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - ������� � ��������� ������ ���
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(reader.readLine());
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < N; i++){
    		list.add(Integer.parseInt(reader.readLine()));
    	}
    	for (Object s: list){
    	    System.out.println(s);     	    
    	}
        return list;
    }
}