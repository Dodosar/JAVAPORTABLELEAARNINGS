package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2){
				return 0;
			}
		});
		
		set.add(1);
		set.add(2);
		set.add(1);
		System.out.println(set);
		
	}

}
