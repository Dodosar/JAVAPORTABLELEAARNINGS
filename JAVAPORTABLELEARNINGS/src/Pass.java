

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stroka = "Car can carry no mere than 4 people";
		
		try {
			useCar(5);
		}catch(PEx e){
			System.out.println(e);
			System.out.println(stroka);
		}
		try {
			useCar(1);
		}catch(PEx e){
			System.out.println(e);
			System.out.println(stroka);
		}
		try {
			useCar(2);
		}catch(PEx e){
			System.out.println(e);
			System.out.println(stroka);
		}
		try {
			useCar(3);
		}catch(PEx e){
			System.out.println(e);
			System.out.println(stroka);
		}
		System.out.println("");
		System.out.println("Car going");
	}
		
public static void useCar(int i) throws PEx{
	if(i>4){
		throw new PEx();
	}
}

	}


