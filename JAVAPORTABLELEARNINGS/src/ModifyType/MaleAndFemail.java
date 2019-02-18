package ModifyType;

public class MaleAndFemail {
    public static void main(String[] args) {
    	Human man = new Man();
    	Human woman = new Woman();

        printName(man);
    }

    public static void printName(Human man) {
    	
    }

    public static class Human {

    }

    public static class Man extends Human{

    }

    public static class Woman extends Human{

    }
}
