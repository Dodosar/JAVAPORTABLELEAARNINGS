package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OrderList {
    public static void main(String[] args) throws IOException {
        //�������� ��� ��� ���
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        
        for(int i = 1; i <list.size(); i++){
            if(list.get(i).length()> list.get(i-1).length()){
                continue;
            }
            else{
                System.out.println(i);
                break;
            }
        }
    }
}

