package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadInCollections {

	public ThreadInCollections() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception {
		List<Integer> list1 = Collections.synchronizedList(new ArrayList<Integer>());
		List<Integer> list2 = new CopyOnWriteArrayList<>();
		
		fillList(list1, 100);
		fillList(list2, 100);
		
		System.out.println("List synchronized:");
		checkList(list1);
		
		
		System.out.println("CopyOnWriteArrayList:");
		checkList(list2);
	}

	private static void checkList(List<Integer> list) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CountDownLatch latch = new CountDownLatch(1);
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<Long> f1 = ex.submit(new ListRunner(0, 50, list, latch));
		Future<Long> f2 = ex.submit(new ListRunner(50, 100, list, latch));
		
		latch.countDown();
		System.out.println("Thread 1:" +f1.get()/1000);
		System.out.println("Thread 2:" +f2.get()/1000);
		/*for (Integer elem: list){
			System.out.println("elem " + elem);
		}*/
		
	}

	private static void fillList(List<Integer> list, int i) {
		// TODO Auto-generated method stub
		for(int a = 1; a<i; a++){			
			list.add(a);
		}	
		
	}
}
