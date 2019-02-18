package TransformationTypes;

public class Issue12 {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
    	private String name;
    	private int age;
    	private boolean sex;
    	private int weight;
    	private String catName;
    	private int IQ;
    	
    	public Human(String name,boolean sex){
    		this.name = name;
    		this.sex = sex;
    	}
    	
    	public Human(String name, int age,boolean sex){
    		this(name,sex);
    		this.age = age;
    	}
    	
    	public Human(String name, int age,boolean sex,int weight,String catName,int IQ){
    		this(name,age,sex);
    		this.weight = weight;
    		this.catName = catName;
    		this.IQ = IQ;
    	}
    		
    	public Human(String catName,int weight){
    		this.weight = weight;
    		this.catName = catName;
    	}
    	
    	public Human(String name, int age,boolean sex,int IQ){
    		this(name,age,sex);
    		this.IQ = IQ;
    	}
    	
    	public Human(int weight,String catName,int IQ){
    		this.weight = weight;
    		this.catName = catName;
    		this.IQ = IQ;
    	}
    	
    }
}
