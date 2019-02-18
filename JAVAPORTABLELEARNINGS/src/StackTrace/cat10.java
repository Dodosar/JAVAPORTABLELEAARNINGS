package StackTrace;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
������ �����
*/

public class cat10 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //�������� ��� ��� ���
    	HashMap<String, Cat> map = new HashMap<String, Cat>();
    	for(int i = 0; i < 10; i++){
    		map.put("Marpha"+i, new Cat("Cat"+i));
    	}
    	return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //�������� ��� ��� ���
    	Set<Cat> listofCat = new HashSet();
    	for(Map.Entry<String, Cat> a :map.entrySet()){    		
    		listofCat.add(a.getValue());
    	}
    	return listofCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
