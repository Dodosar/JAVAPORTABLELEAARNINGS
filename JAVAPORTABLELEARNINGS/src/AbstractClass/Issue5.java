package AbstractClass;

public class Issue5 {
    public static void main(String[] args) {

    }
    //����� ���������
    public interface Movable {
        void move();
    }

    //����� ���� ������
    public interface Eatable {
        void eaten();
    }

    //����� ����-������ ������
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