package SynchronizedThreads;

import java.security.InvalidParameterException;
import java.util.concurrent.Callable;

/*
 *created by Dima Tiurin Feb 19, 2019
 */

public class FactorialTaskWithCallable implements Callable<Integer>{
	int number;
	 
    // standard constructors
 
    public FactorialTaskWithCallable(int i) {
		// TODO Auto-generated constructor stub
    	//this.number = i;
	}

	public Integer call() throws InvalidParameterException {
        int fact = 1;
        // ...
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }
 
        return fact;
    }
}