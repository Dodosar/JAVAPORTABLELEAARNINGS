package Patterns;

/*
 *created by Dima Tiurin Jan 9, 2019
 */


/*
 * 
Dependency Inversion Principle
https://www.oodesign.com/dependency-inversion-principle.html
 */

public class User {
	Manafactory manafactory;
	public void setProcess(Manafactory a){
		manafactory = a; 
	}
	
	public void shop(){
		manafactory.shop();
	}
}

