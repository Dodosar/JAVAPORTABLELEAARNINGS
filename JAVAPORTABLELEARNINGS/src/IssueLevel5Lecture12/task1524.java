package IssueLevel5Lecture12;

public class task1524 {    
	
    {
        System.out.println("non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";
    static {
        init();
    }
    static {
        System.out.println("Static block");
    }

    public task1524() {
        System.out.println("Solution constructor");
        printAllFields(this);

    }
    

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        task1524 s = new task1524();
    }

    public static void printAllFields(task1524 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
