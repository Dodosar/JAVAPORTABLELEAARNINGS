package HenFactory;

public abstract class Hen {
	private String name;
	
	public Hen(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
		
	public abstract int getCountOfEggsPerMonth();
	
	public String getDescription(){
		return "Я - курица.";
	}
	
	public String toString(){
		return getDescription();
	}

	
}

