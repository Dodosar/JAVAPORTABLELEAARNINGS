package JavaRushLevel6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandfatherName = reader.readLine(); 
        Cat catGrandfather = new Cat(grandfatherName);
        String grandmotherName = reader.readLine(); 
        Cat catGrandmother = new Cat(grandmotherName);
        String fatherName = reader.readLine(); 
        Cat catFather = new Cat(fatherName, catGrandfather);
        String motherName = reader.readLine(); 
        Cat catMother = new Cat(catGrandmother, motherName);
        String sonName = reader.readLine(); 
        Cat catSon = new Cat(sonName, catMother, catFather); 
        String daughterName = reader.readLine(); 
        Cat catDaughter = new Cat(daughterName, catMother, catFather); 
        System.out.println(catGrandfather); 
        System.out.println(catGrandmother); 
        System.out.println(catFather); 
        System.out.println(catMother); 
        System.out.println(catSon); 
        System.out.println(catDaughter); 
        
    } 

    public static class Cat {
        private String name;
        private Cat mother; 
        private Cat father; 
        Cat(String name) { 
            this.name = name;
        } 
        Cat(String name, Cat father) {
            this.name = name;
            this.father = father; 
        }
        Cat(Cat mother, String name) {
            this.name = name;
            this.mother = mother; 
        }
        Cat(String name, Cat mother, Cat father) { 
            this.name = name;
            this.mother = mother;
            this.father = father; 
        }
         @Override public String toString() {
             if (mother == null && father == null){
                 return "Cat name is " + name + ", no mother, no father";
                 }
                 else 
                 {
                     if (mother == null || father == null) {
                         if (mother == null) {
                             return "Cat name is " + name + ", no mother, father is " + father.name;
                             }else
                             {
                                 return "Cat name is " + name + ", mother is " + mother.name + ", no father";
                                 }
                                 }
                                 else {
                                     return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                                     }
                                } 
            }
        }
    }

 