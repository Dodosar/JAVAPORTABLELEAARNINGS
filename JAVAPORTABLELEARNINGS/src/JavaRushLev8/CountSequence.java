package JavaRushLev8;


import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Cамая длинная последовательность
*/
public class CountSequence {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i  = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        /*for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i)<list.get(j)){
                int tmp = list.get(j);
                list.set(j,list.get(i));
                list.set(i,tmp);
                }
            }
        }*/
        int a = list.get(0);
        int maxCortage = 0;
        int count = 1;
        for(int i = 1; i< list.size(); i++){
            if(a == list.get(i)){
                count++;
                a = list.get(i);
            }
            else{
            	if(maxCortage < count)
            	{
            		maxCortage = count;
            	}
                count = 1;
                a = list.get(i);
            }
        }
    	if(maxCortage < count)
    	{
    		maxCortage = count;
    	}
    	System.out.println(maxCortage);
    }
}