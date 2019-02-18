package ThreadSleep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Issue1629 {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();        
        t1.join();
        t1.printResult();
        t2.start();  
        t2.join();
        t2.printResult();
        
        reader.close();
        


    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
    	private List<String> result = new ArrayList<String>(); 
    	private int countStrings = 0;
    	public void run(){
    		while(countStrings<3){
    			try{
    				result.add(reader.readLine());
    				countStrings++;
    			}
    			catch(IOException e){
    				
    			}
    		}
    	}
    	
    	public void printResult(){
    		for(String a : result){
    			System.out.print(a + " ");
    		}
			   		
    	}
    }
}
