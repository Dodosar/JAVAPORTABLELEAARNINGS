package JavaRushLev8;

import java.util.HashSet;
import java.util.Random;


public class SetHash {
    public static HashSet<String> createSet() {
        //�������� ��� ��� ���
        HashSet<String> set = new HashSet();
        for(int i = 0; i < 20; i++){
            String dict = "a�����������������������������"; //������ �������� ��� ��������� �������
            Random random = new Random();
            char c = dict.charAt((int) Math.floor(Math.random() * dict.length()));
            char a = dict.charAt((int) Math.floor(Math.random() * dict.length()));
            char b = dict.charAt((int) Math.floor(Math.random() * dict.length()));
            set.add("�" +c +b +a);
        }
        return set;
    }

    public static void main(String[] args) {
    		System.out.println(createSet());
    }
}
