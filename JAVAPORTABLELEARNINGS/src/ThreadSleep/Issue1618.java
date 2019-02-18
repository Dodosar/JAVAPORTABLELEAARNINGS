package ThreadSleep;

public class Issue1618 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
    	TestThread currentThread = new TestThread();
    	currentThread.start();
    	currentThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
    	@Override
    	public void run(){
    		
    	}
    }
}