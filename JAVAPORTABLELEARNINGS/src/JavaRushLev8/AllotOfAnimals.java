package JavaRushLev8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
��������� ���� ��������
*/

public class AllotOfAnimals {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        for(int i = 0; i <4; i++){
        	result.add(new Cat());
        }
        //�������� ��� ��� ���
        return result;
    }

    public static Set<Dog> createDogs() {
        //�������� ��� ��� ���
    	HashSet<Dog> dogResult = new HashSet<Dog>();
    	for(int i = 0; i <3; i++){
    		dogResult.add(new Dog());
    	}
        return dogResult;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //�������� ��� ��� ���
    	HashSet<Object> joinAnimals = new HashSet<Object>();
    	for(Cat a: cats){
    		joinAnimals.add(a);
    	}
    	for(Dog b : dogs){
    		joinAnimals.add(b);
    	}
        return joinAnimals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //�������� ��� ��� ���
    	HashSet<Object> copyPets =new HashSet<Object>(pets);
    	for(Object a : copyPets){
    		for(Cat b :cats){
    			if(a.equals(b)){
    				Iterator iterator = pets.iterator();
    				pets.remove(a);
    			}
    		}
    	}
    }

    public static void printPets(Set<Object> pets) {
        //�������� ��� ��� ���
    	for(Object a : pets){
    		System.out.println(a);
    	}
    }

    //�������� ��� ��� ���
    public static class Cat{
    	
    }
    
    public static class Dog{
    	
    }
}
