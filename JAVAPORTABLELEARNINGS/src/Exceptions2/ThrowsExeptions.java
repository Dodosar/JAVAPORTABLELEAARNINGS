package Exceptions2;

import java.io.File;
import java.io.IOException;

public class ThrowsExeptions {
	
	public static void main(String args[])throws IOException{
        createNewFileRethrow();
    }

    public static void createNewFileRethrow() throws IOException{
    	System.out.println("test before");
        File file = new File("test/nonexistent.txt");
        file.createNewFile();
        System.out.println("test after");
    }
}

