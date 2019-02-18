package HenFactory;

public class BelarusianHen extends Hen{

	public int getCountOfEggsPerMonth(){
		return 300;
	}
	@Override
	public String getDescription(){
		return "��� ������ - "+ getName() + ".� ���� " +getCountOfEggsPerMonth()+ " ��� � �����." ;
	}
	
	public BelarusianHen(String name){
		super(name);
	}
	
	public String toString(){
		return getDescription();
	}


}