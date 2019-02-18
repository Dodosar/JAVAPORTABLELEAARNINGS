package TransformationTypes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
������ �� ����������
*/

public class Issue19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //�������� ��� ��� ���
    	for(int i = 0; i <array.length-1; i++){
    		for(int j = i+1; j <array.length; j++){
    			if(array[j]<array[i]){
    				int temp = array[j];
    				array[j] = array[i];
    				array[i] = temp;
    			}
    		}
    	}
    }
}