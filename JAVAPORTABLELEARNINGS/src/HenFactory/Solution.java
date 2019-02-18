package HenFactory;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen);
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.equals("Ukraine")){
            	hen = new UkrainianHen(country);
            }
            else if(country.equals("Russia")){
            	hen = new RussianHen(country);
            }
            else if(country.equals("Moldova")){
            	hen = new MoldovanHen(country);
            }
            else if(country.equals("Belarus")){
            	hen = new BelarusianHen(country);
            }
            //напишите тут ваш код
            return hen;
        }
    }


}
