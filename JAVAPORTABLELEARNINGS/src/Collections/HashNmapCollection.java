package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

import javax.xml.crypto.Data;


public class HashNmapCollection {

	public HashNmapCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		HashMap<Integer, String> m =new HashMap<Integer, String>();
		m.put(5, "a");
		m.put(4, "b");
		m.put(3, "c");
		m.put(2, "d");
		m.put(1, "e");
		
		System.out.println(m);
		
		LinkedHashMap<Integer, String> n = new LinkedHashMap<Integer, String>();
		n.put(5, "a");
		n.put(4, "b");
		n.put(3, "c");
		n.put(2, "d");
		n.put(1, "e");
		
		System.out.println(n);
		
		LinkedHashMap<Integer, String> c = new LinkedHashMap<Integer, String>(5, 1, true);
		c.put(5, "a");
		c.put(4, "b");
		c.put(3, "c");
		c.put(2, "d");
		c.put(1, "e");
		c.get(3);
		c.get(5);
		c.put(4,"b");		
		c.get(1);
		
		System.out.println(c);
		
		Map<Integer, String> d = new SimpleLRUCache(2);		
		d.put(1, "a");
		d.put(2, "b");
		d.put(3, "c");
		d.get(2);
		d.put(9, "e");
		
		System.out.println(d);
		
		Map<Object, String> map = new WeakHashMap<Object, String>();
		Object data = new Object();
		map.put(data,  "information");
		
		data = null; // to do access to gc()
		System.gc();
		
		for(int i=1; i<10000; i++) {
			//System.out.println(map.get(data));
			if(map.isEmpty()){
				System.out.println(i);
				System.out.println("Empty!");
				break;
			}
			
		}
		
		
	}
	

}
