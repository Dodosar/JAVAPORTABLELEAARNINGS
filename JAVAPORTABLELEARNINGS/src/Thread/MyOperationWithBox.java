package Thread;

/*
 *created by Dima Tiurin Jan 9, 2019
 */

public class MyOperationWithBox {
	public static void main(String[] args)
	{
	Box Box = new Box("Вася");
	Box.start();

	Box Box2 = new Box("Коля");
	Box2.start();

	}
}

