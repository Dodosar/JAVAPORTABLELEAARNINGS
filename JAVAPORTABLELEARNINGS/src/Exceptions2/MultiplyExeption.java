package Exceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbersExceptionHandling();
	}
	
	 public static void numbersExceptionHandling(){
	        File file = new File("resources/nonexistent.txt");
	        try(Scanner fileReader = new Scanner(file);){
	            

	            while(fileReader.hasNext()){
	                double num = fileReader.nextDouble();
	                System.out.println(num);
	            }
	            
	        }catch(FileNotFoundException e){
	        	e.printStackTrace();
	        }catch(InputMismatchException e){
	        	e.printStackTrace();
	        }
	    }
}
