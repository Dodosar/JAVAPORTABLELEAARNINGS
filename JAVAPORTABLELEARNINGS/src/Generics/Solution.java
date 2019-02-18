package Generics;

import java.util.List;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeType<?> someType = new SomeType<Object>();
		List<String> list = Arrays.asList("value");
		List<Integer> list1 = Arrays.asList(5);
		someType.test(list);
		someType.test(list1);
	}

}
