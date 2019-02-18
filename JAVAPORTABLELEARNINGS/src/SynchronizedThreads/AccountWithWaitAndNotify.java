package SynchronizedThreads;

/*
 *created by Dima Tiurin Feb 18, 2019
 */

public class AccountWithWaitAndNotify {
	public static void main(String[] args) throws Exception {
		Account account = new Account(0);
		new DepositThread(account).start();
		
		System.out.println("Calling waitAndWithDraw()...");
		
		account.waitAndWithdraw(50_000_000);
		
		System.out.println("waitAndWithDraw() finished");
}
	
	private static class WithdrawThread extends Thread {
		private final Account account;
		
		private WithdrawThread(Account account) {this.account = account;}
		
		@Override
		public void run(){
			for(int i = 0 ; i < 50_000_000; ++i){
				account.withdraw(1);
			}
		}
	}
	
	private static class DepositThread extends Thread {
		private final Account account;
		
		private DepositThread(Account account) {this.account = account;}
		
		@Override
		public void run(){
			for(int i = 0 ; i < 50_000_000; ++i){
				account.deposit(1);
			}
		}
	}
}

