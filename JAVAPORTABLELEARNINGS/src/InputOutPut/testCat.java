package InputOutPut;

public class testCat {
	 
		public static void main(String[] args)
		{
		 Cat cat = new Cat("������ ");
		 Cat catWrap = new CatWrapper (cat);
		 printName(catWrap);
		}

		public static void printName(Cat named)
		{
		 System.out.println(named.getName());
		}	
}
