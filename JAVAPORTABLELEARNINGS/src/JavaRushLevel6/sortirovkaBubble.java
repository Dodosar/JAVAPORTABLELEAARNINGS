package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
����� �� �����������
*/

public class sortirovkaBubble {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //�������� ��� ��� ���
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        
        int[] mas = {a,b,c,d,e};
        
        int j;
        int temp;
        //boolean flag = true; //����������, ������� �������� �� ��������������� ��������� � �������
        
       /* while(flag){ //������ � while ����
        	flag =false; // ��������� swapped �� false
        	for(j = 0; j < mas.length - 1; j++ ){ // ������ � ���� for
        		if(mas[j]>mas[j+1]){
        		// ��������: ���� ������� ��� �������� i=1, �.�. 11, ������ ��������
                // ��� �������� i=2, �.�. 4, �� ������ �� �������
                // 
        			temp = mas[j];
        			mas[j] = mas[j+1];
        			mas[j+1] = temp;
        			flag = true; // true ��������, ��� ������ ������� ���� ���������
                }
        		}
        	}
        }*/
        
        for(int i = 0; i < mas.length-1; i++){
        	System.out.println("this i" +i);
            for(j = i+1; j < mas.length; j++) {
            	System.out.println("this j" +j);
              if(mas[j] > mas[i]) { // ���� ��������� ������� ���������� �� �����������
                                          // �������� �������� �������
            	temp = mas[j];
                mas[j] = mas[i];
                mas[i] = temp;

            }
          }

        }
        for(int i = 0; i<mas.length; i++){
        	System.out.println(mas[i]);
        }
        
        
        
        
        
    }
}
