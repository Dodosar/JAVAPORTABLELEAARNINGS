package Exceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyExceptions {


	    public static void main(String args[]){
	        createNewFile();
	        numbersExceptionHandlingAnother();
	    }

	    public static void createNewFile(){
	        File file = new File("test/nonexistent.txt");
	        try{
	            file.createNewFile();
	        }catch (Exception e){
	            System.out.println("Directory does not exist.");
	            e.printStackTrace();
	        }
	        
	        System.out.println("This is test");
	    }
	    
	   
	        
		    public static void numbersExceptionHandlingAnother(){
		        File file = new File("resources/number.txt");
		        Scanner fileReader = null;
		        try{
		            fileReader = new Scanner(file);

		            while(fileReader.hasNext()){
		                double num = fileReader.nextDouble();
		                System.out.println(num);
		            }	            

		        }
	        catch(FileNotFoundException | InputMismatchException e){
	            e.printStackTrace();
	        }finally {
	        	fileReader.close();
	        }
		       
	    }
	    
	    
}