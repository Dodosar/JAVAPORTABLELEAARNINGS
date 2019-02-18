package JavaRash;
import java.io.*;

public class SolutionForReadKeyboard {

	public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your selection:\t");
        String integer = bufferedReader.readLine();
        System.out.print("Please enter your selection:\t");
        int value = Integer.parseInt(integer);
        String name = bufferedReader.readLine();
        System.out.print(name + " захватит мир через " + value + " лет. ћу-ха-ха!");
    }
	
	

}
