package TransformationTypes;


	import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

	/* 
	Безопасное извлечение из списка
	*/
	public class Issue16 {

	    public static void main(String[] args) throws Exception {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i = 0; i < 20; i++) {
	            int x = Integer.parseInt(reader.readLine());
	            list.add(x);
	        }

	        System.out.println(safeGetElement(list, 5, 1));
	        System.out.println(safeGetElement(list, 20, 7));
	        System.out.println(safeGetElement(list, -5, 9));
	    }

	    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
	        //напишите тут ваш код.
	    	ArrayList<Integer> listCopy = new ArrayList<Integer>(list);
	    	int c = 0;
	    	try{
	    		c = list.get(index);
		    }
	    	catch(IndexOutOfBoundsException e){
		    	c = defaultValue;
		    	}  	
	    	return c;
	    }

	}