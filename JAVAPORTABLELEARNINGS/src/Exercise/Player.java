package Exercise;

public class Player {
	
	private String name;
	
	private String guess;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setGuess(String guess) {
		this.guess= guess;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGuess() {
		return guess;
	}
	
	public Player(String name) {
		setName(name);
	}
}
