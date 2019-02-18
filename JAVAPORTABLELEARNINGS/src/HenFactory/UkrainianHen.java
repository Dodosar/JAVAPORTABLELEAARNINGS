package HenFactory;


public class UkrainianHen extends Hen{

	public int getCountOfEggsPerMonth(){
		return 200;
	}
	@Override
	public String getDescription(){
		return "��� ������ - "+ getName() + ".� ���� " +getCountOfEggsPerMonth()+ " ��� � �����." ;
	}


	public UkrainianHen(String name){
		super(name);
	}
	
	public String toString(){
		return getDescription();
	}
}