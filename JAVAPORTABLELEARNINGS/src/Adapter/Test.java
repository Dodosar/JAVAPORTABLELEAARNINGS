package Adapter;

public class Test {
	public static void main(String[] args) 
	{
	 AlphaList listAlpha = AlphaListManager.createList();
	 BetaList listBeta = new ListAdapter(listAlpha);
	 BetaSaveManager.saveList(listBeta);
	}
}
