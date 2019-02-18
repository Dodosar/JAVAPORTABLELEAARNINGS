package ThreadSleep;

public class Issue1623 {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
    	public GenerateThread(){
    		super(String.valueOf(++countCreatedThreads));
    		start();
    	}
    	
    	@Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return getName() + " created";
    	}
    	
    	public void run(){
    		if(countCreatedThreads<Issue1623.count){
    			System.out.println(new GenerateThread());
    		}
    	}
    }
}

