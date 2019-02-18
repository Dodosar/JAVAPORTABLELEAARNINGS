package HenFactory;

public class MoldovanHen extends Hen{

	public int getCountOfEggsPerMonth(){
		return 300;
	}
	@Override
	public String getDescription(){
		return "ћо€ страна - "+ getName() + ".я несу " +getCountOfEggsPerMonth()+ " €иц в мес€ц." ;
	}
	
	public MoldovanHen(String name){
		super(name);
	}
	
	public String toString(){
		return getDescription();
	}

}
