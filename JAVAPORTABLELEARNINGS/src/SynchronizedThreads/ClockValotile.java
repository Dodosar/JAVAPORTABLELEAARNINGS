package SynchronizedThreads;

import java.util.Scanner;

/*
 *created by Dima Tiurin Feb 18, 2019
 */

class ClockValotile implements Runnable
{
private volatile boolean isCancel = false;

public void cancel()
{
this.isCancel = true;
}

public void run()
{
while (!this.isCancel)
{
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Tik " + Thread.currentThread());
}
}

public static void main(String[] args) throws InterruptedException
{
ClockValotile clock = new ClockValotile();
Thread clockThread = new Thread(clock);
clockThread.start();
/*ClockValotile clock2 = new ClockValotile();
Thread clockThread2 = new Thread(clock2);
clockThread2.start();
Thread.sleep(5000);
clock2.cancel();*/
//Thread.sleep(10000);

Scanner scanner = new Scanner(System.in);
scanner.nextLine();

clock.cancel();
}
}
