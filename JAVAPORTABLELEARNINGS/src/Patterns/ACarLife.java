package Patterns;

/*
 *created by Dima Tiurin Jan 9, 2019
 */

public class ACarLife {
	public static void main(String[] args){
		User user = new User();
		user.setProcess(new ShopFirst());
		user.shop();
		user.setProcess(new ShopSecond());
		user.shop();
		user.setProcess(new ShopThird());
		user.shop();
		user.setProcess(new ShopFourth());
		user.shop();
		user.setProcess(new Magazine());
		user.shop();
	}
}

