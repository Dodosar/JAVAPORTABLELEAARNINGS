package Currency;

public class Hrivna extends Money {
	@Override
	public String getCurrencyName() {
		// TODO Auto-generated method stub
		return "HRN";
	}
	
	public Hrivna(double amount){
		super(amount);		
	}
}
