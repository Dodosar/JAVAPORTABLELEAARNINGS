package Collections;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

class ListRunner implements Callable<Long> {
	CountDownLatch latch;
	List<Integer> list;
	int start;
	int end;
	
	public ListRunner(int i, int j, List<Integer> list, CountDownLatch latch) {
		// TODO Auto-generated constructor stub
		this.start = i;
		this.end = j;
		this.list = list;
		this.latch = latch;
	}
	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		latch.await();
		
		long startTime = System.nanoTime();
		for(int i = start; i < end; i++){
			list.get(i);
		}
		return System.nanoTime() - startTime;
	}

}
