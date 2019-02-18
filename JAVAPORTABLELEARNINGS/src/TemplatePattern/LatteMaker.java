package TemplatePattern;

public class LatteMaker extends DrinkMaker{

	@Override
	void getRightCup() {
		// TODO Auto-generated method stub
		System.out.println("Берем чашку для латте");
	}

	@Override
	void putIngredient() {
		// TODO Auto-generated method stub
		System.out.println("Делаем кофе");
	}

	@Override
	void pour() {
		// TODO Auto-generated method stub
		System.out.println("Заливаем молоком с пенкой");
	}


}
