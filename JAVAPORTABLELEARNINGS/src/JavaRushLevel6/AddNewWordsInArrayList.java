package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class AddNewWordsInArrayList {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "����", "����", "����");
        
        for(int i = 1; i <= list.size(); i++){
        	list.add(i++, "������");
        
        }
        
        for(Object a : list){
            System.out.println(a);
        }
    }
}

