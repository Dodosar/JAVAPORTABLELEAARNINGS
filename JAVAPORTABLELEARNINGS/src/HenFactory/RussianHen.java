package HenFactory;


public class RussianHen extends Hen{
	 
	public int getCountOfEggsPerMonth(){
		return 200;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+" ������������� ������. " +"��� ������ - "+ getName() + ".� ���� " +getCountOfEggsPerMonth()+ " ��� � �����." ;
	}
	
	public RussianHen(String name){
		super(name);
	}
	
	/*public String toString(){
		return getName();
	}*/

}