package InputOutPut;

import java.io.File;
import java.io.IOException;

public class IOFile {
  public static void main(String[] args) {
	  String name = System.console().readLine(); 
	  System.out.println(name); 
	File myObj = new File("filename.txt");
	try {
		myObj.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}
