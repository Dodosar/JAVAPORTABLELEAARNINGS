package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Lev7Lec122 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        
        ArrayList<String> list = new ArrayList();

        for(int i = 0; i < N; i++){
            list.add(reader.readLine());
        }

        for(int i = 0; i < M; i++){
            list.add(list.get(0));
            list.remove(0);
        }
        
        for(Object a : list){
            System.out.println(a);
        }
        
    }

}
