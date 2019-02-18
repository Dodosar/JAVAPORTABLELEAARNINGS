package JavaRash;
import java.util.ArrayList;

public class L6L11Is2 {
    public static ArrayList cats = new ArrayList();

    public L6L11Is2() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i = 0; i<10;i++){
        	L6L11Is2.cats.add(new L6L11Is2());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
    	for(int i = 0; i<cats.size(); i++){
    		System.out.println(L6L11Is2.cats.get(i).toString());
    	}
        
    }
}


