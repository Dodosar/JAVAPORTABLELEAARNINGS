package JavaRash;

import static net.MyLibrary.Print.*;

import java.io.*;

public class Cat1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int integer1 = 3;
        int integer2 = 5;
        int integer3 = 4;
        
        if(integer1 == integer2 && integer2 == integer3){
            printnb(integer1+ " " +integer2+ " " +integer3);
        }
        else if(integer1 == integer2){
            print(integer1+ " " +integer2);
        }
        else if(integer1 == integer3){
            printnb(integer1+ " " +integer3);
        }
        else if(integer2 == integer3){
            print(integer2+ " " +integer3);
        }
        else{
            print();
        }
        
    }

}