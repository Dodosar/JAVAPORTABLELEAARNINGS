package HenFactory;

public class MoldovanHen extends Hen{

	public int getCountOfEggsPerMonth(){
		return 300;
	}
	@Override
	public String getDescription(){
		return "��� ������ - "+ getName() + ".� ���� " +getCountOfEggsPerMonth()+ " ��� � �����." ;
	}
	
	public MoldovanHen(String name){
		super(name);
	}
	
	public String toString(){
		return getDescription();
	}

}
