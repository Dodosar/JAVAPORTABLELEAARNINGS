package ThreadInterapt;

/*
 *created by Dima Tiurin Feb 14, 2019
 */

class Clock implements Runnable
{
public void run()
{
Thread current = Thread.currentThread();

while (!current.isInterrupted())
{
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("Sleep interrupted");
}
System.out.println("Tik");
}
}
public static void main(String[] args) throws InterruptedException
{
Clock clock = new Clock();
Thread clockThread = new Thread(clock);
//clockThread.setDaemon(true);
clockThread.start();

Thread.sleep(10000);
clockThread.interrupt();
clockThread.join();
}
}