
public class User {
	String name;
	Area region;
	Type t;
	
	User(String name,Area region,Type t){
		this.name=name;
		this.region= region;
		this.t = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User User1 = new User("Ola ",Area.Minsk,Type.NormalUser);
		System.out.println(User1.t + " " + User1.name + " " +  User1.region);
		System.out.println("");
		for (Area a : Area.values()){
			System.out.println(a + " " + a.getCountry());
					}
		for (Type t :Type.values()){
			System.out.println(t + " mininal reiting " + t.gerReiting());
		}

	}

}
