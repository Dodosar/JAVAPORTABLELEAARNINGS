package ThreadSleep;

import java.util.ArrayList;
import java.util.List;

import ThreadSleep.Issue1618.TestThread;

/* 
���� ��� ����, ��� - ��� ������
*/

public class Issue1619 {
    public static byte countThreads = 3;
    static List<Thread> threads = new ArrayList<Thread>(countThreads);
    

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        //add your code here - ������ ��� ���
    	for(Thread a : threads){
    		a.interrupt();
    	}
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < countThreads; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < countThreads; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String commonResource;
        

        public Water(String commonResource) {
            this.commonResource = commonResource;
        }

        public void run() {
            //fix 2 variables - ������� 2 ����������
        	boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("������ " + commonResource + ", ���� " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
