package AbstractClass;

public class Issue5 {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    
    
    public static class Dog implements Movable,Eat{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
    	
    }
    
    public static class Cat implements Movable,Eatable,Eat{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void eaten() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
    	
    }

    public static class Mouse implements Movable,Eatable{

		@Override
		public void eaten() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
	
    }
}