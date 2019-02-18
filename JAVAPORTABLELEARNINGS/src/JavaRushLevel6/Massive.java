package JavaRushLevel6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Massive {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] massive = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < massive.length; i++){
            massive[i] = Integer.parseInt(reader.readLine());
        }
        return massive;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for(int i = 0; i <array.length; i++){
            if(max <= array[i]){
                max = array[i];
            }
        }
        return max;
    }
}