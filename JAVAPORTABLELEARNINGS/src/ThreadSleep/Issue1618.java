package ThreadSleep;

public class Issue1618 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - ������ ��� ���
    	TestThread currentThread = new TestThread();
    	currentThread.start();
    	currentThread.interrupt();
    }

    //Add your code below - ������ ��� ����
    public static class TestThread extends Thread{
    	@Override
    	public void run(){
    		
    	}
    }
}