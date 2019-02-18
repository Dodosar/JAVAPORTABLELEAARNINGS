package HenFactory;


public class UkrainianHen extends Hen{

	public int getCountOfEggsPerMonth(){
		return 200;
	}
	@Override
	public String getDescription(){
		return "ћо€ страна - "+ getName() + ".я несу " +getCountOfEggsPerMonth()+ " €иц в мес€ц." ;
	}


	public UkrainianHen(String name){
		super(name);
	}
	
	public String toString(){
		return getDescription();
	}
}