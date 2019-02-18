package JavaRushLevel6;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class doubleLet {
    public static void main(String[] args) throws Exception {
        // —читать строки с консоли и объ€вить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // ¬ывести на экран result
        for(Object a : result){
        	System.out.println(a);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
    	ArrayList<String> result = new ArrayList<String>();
        for( int i = 0; i < list.size(); i++){
        	result.add(list.get(i));
        	result.add(list.get(i));
        }
        return result;
    }
}
