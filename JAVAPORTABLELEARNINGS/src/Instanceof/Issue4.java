package Instanceof;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Issue4 {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String catName = reader.readLine();
        while(true){
        	if(catName.isEmpty()){
        		break;
        	}
        	CatFactory cat1 = new CatFactory();
        	System.out.println(cat1.getCatByKey(catName));
        	catName = reader.readLine();        	
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("�������");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("�������");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("��������");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "� ������� ��� " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "� - �������� ����� �� ����� " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "� - ����� ������� �� ����� " + getName();
        }
    }
}