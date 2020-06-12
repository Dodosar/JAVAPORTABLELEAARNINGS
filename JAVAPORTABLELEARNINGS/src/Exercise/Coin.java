package Exercise;

import java.util.Random;

public class Coin {
	
	private String side;
	
	protected static int heads = 1;
	
	protected static int tails = 2;
	
	public void setSide(String side) {
		this.side =side;
	}
	
	public String getSide(){
		return side;
	}
	
	public String flip() {
		Random random = new Random();
		int a = random.nextInt((tails - heads) + 1) + heads;
		String flipSide = String.valueOf(a);	
		if(flipSide.equals("1")) {
			flipSide = "heads";
		}
		else {
			flipSide = "tails";
		}
		setSide(flipSide);
		return getSide();
	}
	
	/*
	 * public static String HEADS = "Heads";
    	public static String TAILS = "Tails";
	 * 
	 *     public String flip(){
        if(new Random().nextBoolean()){
            setSide(HEADS);
        }
        else{
            setSide(TAILS);
        }

        return getSide();
    }
	 * */
	 

}
