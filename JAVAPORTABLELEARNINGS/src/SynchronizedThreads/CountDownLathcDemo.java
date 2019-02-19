package SynchronizedThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;


/*
 *created by Dima Tiurin Feb 19, 2019
 */

public class CountDownLathcDemo {
	public static void main(String[] args) throws Exception{

		CountDownLatch latch = new CountDownLatch(10);
		
		
		
		for(int i = 0; i < 10; ++i){
			new DemoThread(latch).start();
}
	}
	
	public static class DemoThread extends Thread {
		private final CountDownLatch latch;
		
		private DemoThread(CountDownLatch latch) {
			this.latch = latch;
		}
		
		@Override
		public void run(){
			try{
				runUnsafe();
			}
			catch(InterruptedException e) {
				System.out.println(getName() + " interrupted");
			}
		}
		
		public void runUnsafe() throws InterruptedException{
			
			Thread.sleep((long) (Math.random()*10000L));
			
			System.out.println(getName() + " finished initialization");
			
			latch.countDown();
			latch.await();
			
			System.out.println(getName() + " entered main phase");
			
			Thread.sleep((long) (Math.random() * 10000L));
	}
}
}