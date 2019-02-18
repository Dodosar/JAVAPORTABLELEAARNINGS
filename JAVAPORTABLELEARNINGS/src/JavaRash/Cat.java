package JavaRash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

 
public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
    	Cat cat1 = new Cat();
    	cat1.setName("Marpha");
    	cat1.setAge(15);
    	System.out.println(cat1.name +" "+cat1.age);
    	System.out.println(cat1.getName());
    	System.out.println(cat1.getAge());
    	Cat cat2 = new Cat();
    	cat2.setName("Dolpy");
    	cat2.setAge(65);
    	System.out.println(cat2.name +" "+cat2.age);
    	
    }
}
