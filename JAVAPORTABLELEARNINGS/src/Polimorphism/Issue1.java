package Polimorphism;

public class Issue1 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "� - ��������";
        }
    }

    public static class Cat extends Pet {
    	@Override
    	public String getName(){
    		return "� - ���";
    	}
    }
}
