package HenFactory;


public class RussianHen extends Hen{
	 
	public int getCountOfEggsPerMonth(){
		return 200;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+" родительского класса. " +"ћо€ страна - "+ getName() + ".я несу " +getCountOfEggsPerMonth()+ " €иц в мес€ц." ;
	}
	
	public RussianHen(String name){
		super(name);
	}
	
	/*public String toString(){
		return getName();
	}*/

}