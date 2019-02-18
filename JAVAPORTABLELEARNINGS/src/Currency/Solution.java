package Currency;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
            allMoney.add(new USD(200.00));
            allMoney.add(new Hrivna(300.00));
            allMoney.add(new Ruble(400.00));
        }


		private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
