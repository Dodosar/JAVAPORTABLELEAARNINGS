package Instanceof;

public class Issue5 {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //��� �������� ����� ������� ��� ���������� food
    	food.eat();
    	food.onSelect();
    	
    }

    public static void selectableMethods(Selectable selectable) {
        //��� �������� ����� ������� ��� ���������� selectable
    	selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void eat() {
            System.out.println("food was eaten");
        }
        
        public void onSelect(){
        	System.out.println("food was selected");
        }
    }
}
