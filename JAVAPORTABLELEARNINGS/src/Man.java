
public class Man {
	String name;
	int age;
	String shop;
	String order[];
	
	Man(String name,int age,String shop){
		this.name=name;
		this.age = age;
		this.shop = shop;
	}
	
	public void setOrder(String...str){
		this.order= str;
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String Stroka = "Client did reorder";
		Cash cash = new Cash();
		Man order1 = new Man("Petr",35,"badGayes");
		order1.setOrder("Viski ","Stayk");
		Man order2 = new Man("Oly",13,"badGayes");
		order2.setOrder("Gamburger ","Kola");
		Man order3 = new Man("Ivan",44,"badGayes");
		order3.setOrder("Salo ","Vodka");
		
		Bar bar2= new Bar(order2,cash);
		bar2.t.join();
		Bar bar1= new Bar(order1,cash);
		bar1.t.join();
		
		Bar bar3= new Bar(order3,cash);
		bar3.t.join();
		
		System.out.println(Stroka);
		System.out.println();
		
		Man order4 = new Man("Petr-1 ",35,"goodGayes");
		order4.setOrder("Viski ","Stayk");
		Man order5 = new Man("Oly-1 ",13,"goodGayes");
		order5.setOrder("Gamburger ","Kola");
		Man order6 = new Man("Ivan-2 ",44,"goodGayes");
		order6.setOrder("Salo ","Vodka");
		
		Bar bar4= new Bar(order4,cash);
		bar4.t.join();
		Bar bar5= new Bar(order5,cash);
		bar5.t.join();
		Bar bar6= new Bar(order6,cash);
		bar6.t.join();
					

	}

}
