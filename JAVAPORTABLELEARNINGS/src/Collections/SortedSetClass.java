package Collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClass {
	static Integer getNextElem(Integer elem){
		System.out.println(elem+1);
		return elem+1;
		
	}
	
	static Set<Integer> getPrevElems(Integer elem){
		for(int a = elem; a>0;a--){
			System.out.println(a);
		}
		return null;

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Integer> set = new TreeSet<>();
		for(int a = 1; a<11; a++){			
			set.add(a);
		}		
		getNextElem(set.first());
		
		getPrevElems(set.last());
	}

}
