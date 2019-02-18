package Generics1;

public class Phone extends Product<Phone>{
	/*abstract void subCompare(Phone p);*/
	private String model;
	
	public Phone(String name, int price, String model) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.model = model;
	}

}
