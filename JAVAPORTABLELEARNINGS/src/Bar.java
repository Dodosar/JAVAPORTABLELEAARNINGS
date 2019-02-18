
public class Bar implements Runnable{
	Thread t;
	Man client;
	Cash cashBox;
	
	Bar(Man client,Cash cashBox){
		this.client = client;
		this.cashBox = cashBox;
		t = new Thread(this);
		t.start();
			}
	public void run(){
		if(client.shop.equals("BadGayes")){
			cashBox.orderCI(client);
		}else{
			cashBox.orderCINew(client);
		}
	}

}
