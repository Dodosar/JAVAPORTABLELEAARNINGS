package JavaRushLev8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Собираем семейство
*/

public class WeCollectTheFamily {
    public static void main(String[] args) {
        //напишите тут ваш код
    	Human kid1 = new Human("Mitia",true,10);
    	Human kid2 = new Human("Luba",false,15);
    	Human kid3 = new Human("Oleg",true,20);
    	Human kid4 = new Human("Dima",true,30);
    	Human kid5 = new Human("Misha",true,30);
    	Human mother = new Human("Larisa", false,57,kid1,kid2,kid3);
    	Human father = new Human("Udgin",true,58,kid1,kid2,kid3);
    	Human grandfather = new Human("Gena",true,90,mother);
    	Human grandfather2 = new Human("Boris",true,95,father);
    	Human grandMother = new Human("Luba",false, 89,mother);
    	Human grandMother2 = new Human("Sura",false,90,father);
    	
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandfather);
        System.out.println(grandfather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        mother.AddChild(kid4);
        System.out.println(mother);

        
        
    }

    public static class Human {
        //напишите тут ваш код
    	private String name;
    	private Boolean sex;
    	private int age;
    	private ArrayList<Human> children = new ArrayList<>();
    	
    	

    	public Human(String name,Boolean sex,int age){
    		this.name = name;
    		this.sex = sex;
    		this.age = age;
    	}
    	
    	public Human(String name,Boolean sex,int age,Human children){
    		this(name,sex,age);
    		this.children.add(children);
    	}
    	
    	public Human(String name,Boolean sex,int age,Human children1,Human children2,Human children3){
    		this(name,sex,age);
    		this.children.add(children1);
    		this.children.add(children2);
    		this.children.add(children3);
    	}
    	
    	public void setName(String name){
    		this.name =name;
    	}
    	
    	public String getName(){
    		return name;
    	}
    	
    	public void setSex(Boolean sex){
    		this.sex =sex;
    	}    	
    	
    	public Boolean getSex(){
    		return sex;
    	}
    	
    	public void setAge(int age){
    		this.age =age;
    	}    
    	
    	public int getAge(){
    		return age;
    	}
    	
    	
    	public void SetChildren(ArrayList<Human> children)
    	{
    	this.children = children;
    	}
    	
    	public ArrayList<Human> GetChildren()
    	{
    	return children;
    	}
    	
    	public void AddChild(Human child)
    	{
    		children.add(child);
    	}
    	
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
