package SynchronizedThreads;

import static org.junit.Assert.*;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

/*
 *created by Dima Tiurin Feb 19, 2019
 */

public class TestCallable {
	
	@Test
	public void whenTaskSubmitted_ThenFutureResultObtained() throws Exception{
		FactorialTaskWithCallable task = new FactorialTaskWithCallable(5);
		//ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorService executor = Executors.newCachedThreadPool();
	    Future<Integer> future = executor.submit(task);
	    executor.shutdownNow();
	    assertEquals(1, future.get().intValue());
	    future.isDone();
	    executor.shutdown();
	}
}

