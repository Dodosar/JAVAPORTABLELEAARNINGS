package JavaRushLevel6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Lev12Lec124 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        String s = reader.readLine();
        
        while(s != "end"){
            list.add(s);
            s = reader.readLine();
        }
        
        for(Object a : list){
            System.out.println(a);
        }
    }
}