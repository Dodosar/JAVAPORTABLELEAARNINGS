package Interface;

public class Issue1 {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol{

		@Override
		public void askMore(String message) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sayThankYou() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isReadyToGoHome() {
			// TODO Auto-generated method stub
			return READY_TO_GO_HOME;
		}

		@Override
		public void sleepOnTheFloor() {
			// TODO Auto-generated method stub
			
		}
    	

    }
}