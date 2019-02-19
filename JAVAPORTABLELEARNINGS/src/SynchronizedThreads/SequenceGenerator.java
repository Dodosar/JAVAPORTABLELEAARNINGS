package SynchronizedThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
 *created by Dima Tiurin Feb 19, 2019
 */

public class SequenceGenerator {
	private static final AtomicInteger counter = new AtomicInteger();
	
	public static int nextInt() {
		return counter.getAndIncrement();
	}
	
	public static void main (String[] args) throws Exception{
			List<Thread> threads= new ArrayList<>();
			
			
			for(int i = 0; i< 10; ++i){
				Thread thread = new Thread(
						() -> {for (int j = 0; j<500;++j){
					nextInt();
					System.out.println("Counter " + j);}});
				thread.start();
				threads.add(thread);
			}
			
			for (Thread thread : threads){
				thread.join();
			}
			
			System.out.println("Counter final value: " +counter.get());
	}
	
}


