
public class Cash {

	public void orderCI(Man client){
		orders(client);
	}
	
	public synchronized void orderCINew(Man client){
		orders(client);
	}
	
	public void orders(Man client){
		System.out.println(client.name +"" + client.age + " age");
		System.out.print("Order ");
		for(String ord : client.order){
			System.out.print(ord + "");
		}
		System.out.println("");
		System.out.println("");
	}
}
