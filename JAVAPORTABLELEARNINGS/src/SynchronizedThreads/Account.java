package SynchronizedThreads;


/*
 *created by Dima Tiurin Feb 18, 2019
 */

public class Account {
	
	private long balance;	
	
	public Account() {
		this(0L);
	}

	public Account(long balance) {this.balance = balance;}
	
	public long getBalance() {
		return balance;
	}
	
	//public synchronized void deposit(long amount) {
	public  void deposit(long amount) {
		checkAmountNonNegative(amount);
		synchronized (this) {
			balance+= amount;	
			notifyAll();
		}
		
	}
	
	/*public  void deposit(long amount) {
		checkAmountNonNegative(amount);
		synchronized (this) {
			balance+= amount;	
			
		}
		
	}*/
	
	//public synchronized void withdraw(long amount) {
	public  void withdraw(long amount) {
		checkAmountNonNegative(amount);
		synchronized (this) {
		if(balance < amount){
			throw new IllegalArgumentException("not enough money");
		}
		balance-= amount;
		}
	}
	
	private static void checkAmountNonNegative(long amount){
		if (amount < 0){
			throw new IllegalArgumentException("negative amount");
		}
	}
	
	public synchronized void waitAndWithdraw(long amount) throws Exception{
		checkAmountNonNegative(amount);
		while(balance < amount){
			this.wait();
			System.out.println("Wakeup " + balance);
		}
		balance-= amount;
	}

}




