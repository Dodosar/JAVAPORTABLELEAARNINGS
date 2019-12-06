package FactoryMethod;
import java.util.Date;

public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WatchMaker maker = new DigitalWatchMaker(); // new RomeWatchMaker()
		Watch watch = maker.createWatch();
		watch.showTime();
	}

}

interface Watch {
	void showTime();
}

class DigitalWatch implements Watch {

	@Override
	public void showTime() {
		// TODO Auto-generated method stub
		System.out.println(new Date());
	}
}

class RomeWatch implements Watch {


	@Override
	public void showTime() {
		// TODO Auto-generated method stub
		System.out.println("VII-XX");
	}
}

interface WatchMaker{
	Watch createWatch();
}


class DigitalWatchMaker implements WatchMaker{
	public Watch createWatch() {
		return new DigitalWatch();
	}	
}

class RomeWatchMaker implements WatchMaker{
	public Watch createWatch() {
		return new RomeWatch();
	}	
}