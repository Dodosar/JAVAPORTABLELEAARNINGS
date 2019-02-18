package JavaRushLev8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set �� �����
*/

public class SetForCats {
    public static void main(String[] args) {
    	HashSet<Cat> cats = createCats();

        //�������� ��� ��� ���. step 3 - ����� 3
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static HashSet<Cat> createCats() {
        //�������� ��� ��� ���. step 2 - ����� 2
    	HashSet<Cat> cat = new HashSet<Cat>();
        for(int i = 0; i < 3; i++){
            cat.add(new Cat("Cat"+i));
        }
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - ����� 4
        for(Cat a : cats){
            System.out.println(a);
        }
    }

    // step 1 - ����� 1
    public static class Cat{
        private String name;
        public Cat(String value){
        	name = value;
        }
        String getName(){
        	return name;
        }
        
    }
}
