package Polimorphism;

public class Issue6 {
	public interface Fly{
		public void fly();
	}
	
	public interface Climb{
		public void climb();
	}	
	public interface Run{
		public void run();
	}
	
    public class Cat implements Run,Climb{

		@Override
		public void climb() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
    	
    }

    public class Dog implements Run{
    	@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly,Run{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			
		}
    }
}