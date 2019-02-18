package Thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		Thread childThread = new Thread(printer);
		Thread childThread2 = new Thread(printer);
		Thread childThread3 = new Thread(printer);
		childThread.start();
		try {
			childThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("1");
		System.out.println("2");
		childThread2.start();
	}
}
