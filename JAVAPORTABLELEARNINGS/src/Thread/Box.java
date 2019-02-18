package Thread;

/*
 *created by Dima Tiurin Jan 9, 2019
 */

public class Box extends Thread
{
private String name;
public Box(String name)
{
this.name = name;
}
public void run()
{
System.out.println("I’m " + this.name);
}
}

