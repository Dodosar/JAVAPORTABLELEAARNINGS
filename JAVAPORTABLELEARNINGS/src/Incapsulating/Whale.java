package Incapsulating;

public class Whale extends Cow
{
public void printName()
{
	
	 /* public void printColor()
{
System.out.println("� � �����");
}
	 */
System.out.print("��� ��������: ");					
super.printName();
/*
public void printName()
{
System.out.println("� � ������");
}
 */

System.out.println("� � ���");
}


public static void main(String[] args)
{
Whale whale = new Whale();
whale.printAll();
}
}