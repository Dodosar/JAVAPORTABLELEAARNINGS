
public class Main {//* проброс throw
    
	static int cigma;
	static int beta=7; 
	/*public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		method1();
		System.out.println("Продолжение работы cigma = " + beta);

	}
	public static void method1() throws ArithmeticException {
		int a = (int)(Math.random()*3);
		cigma = beta/a;
	}*/
	public static void main(String[] args) throws InterruptedException{
		String stroka = "а = 0, делить на 0 нельзя";
		String strokacount = ("Continuing work.cigma= " + beta);
		try{
			method1();
			Thread.sleep(3000);
				}catch(ArithmeticException e){
					System.out.println(stroka);
					System.out.println("Exception = " + e);
				}
		
		Thread t = Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread now have priority " + t);
		t.setName("My main Thread");
		System.out.println("Thread now have name " + t);
		System.out.println("Staus of thread " + t.getState());
		System.out.println("Count of working threads: " + Thread.activeCount());
		System.out.println(strokacount);
	}

	public static void method1() throws ArithmeticException {
		int a = 0;
		cigma = beta/a;
	}
	

}
