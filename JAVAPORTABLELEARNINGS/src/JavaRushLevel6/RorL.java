package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
� ��� �
*/

public class RorL {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("����"); //0
        list.add("����"); //1
        list.add("����"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
    	for (int i = 0; i < list.size(); i++) {
    		if ( list.get(i).contains("�") && !list.get(i).contains("�"))
    		{ 
    			list.remove(i);
    			i--;
    		} else if ( list.get(i).contains("�") && !list.get(i).contains("�"))
    		{ 
    			list.add(i+1,list.get(i));
    			i++;
    			}
}
    	return list;
    	} 
    }