package StackTrace;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class ListArrayWithInteger {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
    	ArrayList<int[]> listArray = new ArrayList();
    	listArray.add(new int[5]);
    	listArray.add(new int[2]);
    	listArray.add(new int[4]);
    	listArray.add(new int[7]);
    	listArray.add(new int[0]);
    	Random random = new Random();
    	for(int[] a : listArray){
    		for(int i = 0; i <a.length; i++){
    			a[i] = random.nextInt(10);
    		}
    	}
    	return listArray;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
