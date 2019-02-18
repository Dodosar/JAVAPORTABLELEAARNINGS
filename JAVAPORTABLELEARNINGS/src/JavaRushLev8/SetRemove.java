package JavaRushLev8;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

/* 
������ 10? �� ��� �� ���������
*/

public class SetRemove {
    public static HashSet<Integer> createSet() {
        //�������� ��� ��� ���
        HashSet<Integer> set = new HashSet();
        for(int i = 0; i < 20; i++){
            Random random = new Random();
            set.add((int) Math.floor(Math.random()*100));
        }
        System.out.println("Set" +set);
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //�������� ��� ��� ���
    	HashSet rSet= (HashSet)set.clone();
    	System.out.println("rSet" +rSet);
    	for(Object a : set){
    		if((Integer)a > 10){
    			rSet.remove(a);
            }
        }
        return rSet;
    }

    public static void main(String[] args) {
    	System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}