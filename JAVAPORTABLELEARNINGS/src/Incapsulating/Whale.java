package Incapsulating;

public class Whale extends Cow
{
public void printName()
{
	
	 /* public void printColor()
{
System.out.println("я Ц белый");
}
	 */
System.out.print("Ёто неправда: ");					
super.printName();
/*
public void printName()
{
System.out.println("я Ц корова");
}
 */

System.out.println("я Ц кит");
}


public static void main(String[] args)
{
Whale whale = new Whale();
whale.printAll();
}
}