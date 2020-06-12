package Exercise;

//https://github.com/angiejones/java-programming/blob/master/exercises/project/CoinTossGame.java

public class CoinTossGame {
	public static void main(String[] args) {
	Player playerOne = new Player("Jack");
	
	Player playertwo = new Player("Smit");
	
	Coin coin = new Coin();
	
	playerOne.setGuess(coin.flip());
	
	if(playerOne.getGuess().equals("heads")) {
		playertwo.setGuess("tails");
		System.out.println("Player One is winner:" + playerOne.getGuess());
	}
	else {
		playertwo.setGuess("heads");
		System.out.println("Player Two is winner:" + playertwo.getGuess());
	}
	
	
	}
}
