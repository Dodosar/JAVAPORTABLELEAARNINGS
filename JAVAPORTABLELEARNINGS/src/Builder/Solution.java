package Builder;

/*
 *created by Dima Tiurin Jan 8, 2019
 */

public class Solution {
	public static void main(String[] args) {
		GoodClass goodClass = new GoodClass.Builder(40, 20)
        .optFieldOne(2)
        .optFieldTwo(4)
        .optFieldThird(23)
        .optFieldFour(9)
        .buidl();
    }

}

