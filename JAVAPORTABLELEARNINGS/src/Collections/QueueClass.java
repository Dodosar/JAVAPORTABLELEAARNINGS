package Collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueClass {

	public QueueClass() {
		// TODO Auto-generated constructor stub
	}	
	
	public static void main(String[] args) {

		
		Queue<Integer> a = new LinkedList();
		
		a.add(5);
		System.out.println(a.poll());
		a.add(4);
		System.out.println(a.poll());
		a.add(3);
		System.out.println(a.poll());
		a.add(2);
		System.out.println(a.poll());
		a.add(1);
		System.out.println(a.poll());
			
		while (!a.isEmpty()){
			a.peek();;
		}
		System.out.println(a.peek());
		
		Queue<Integer> b = new PriorityQueue<Integer>(5);
		Random rand = new Random();
		
        for(int i=0; i<7; i++){
        	b.add(new Integer(rand.nextInt(100)));
        }
        
        for(int i=0;i<7;i++){
            Integer in = b.poll();
            System.out.println(" Integer:"+in);
        }
			
		while (!b.isEmpty()){
			b.peek();
		}
		System.out.println(b.peek());
	}
}
