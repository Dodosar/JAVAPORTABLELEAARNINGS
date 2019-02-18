package ThreadSleep;

public class Issue1617 {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - ������ ��� ���
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - ������ ��� ���
        	Thread current = Thread.currentThread();
        	 try {
        		 while (countSeconds > 0) { 
        			 System.out.print(countSeconds + " ");
        			 Thread.sleep(1000);
        			 countSeconds--; 
        			 } 
        		 System.out.print("����!");
        		 } 
        	 catch (InterruptedException e) {
        		 System.out.print("��������!");
        		 }
        }
    }
}