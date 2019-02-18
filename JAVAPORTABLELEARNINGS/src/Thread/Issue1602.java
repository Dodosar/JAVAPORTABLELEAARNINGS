package Thread;

public class Issue1602 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        TestThread thread1 = new TestThread();
        thread.start();
        thread1.start();
    }
    
    public static class TestThread extends Thread{
    	static{
    		System.out.println("it's a static block inside TestThread");
    	}
    	
    	public void run(){
    		 
    		System.out.println("it's a run method");
    	}
    }
}