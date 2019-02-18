package Generics;

import java.util.ArrayList;
import java.util.List;

public class Process {
	
	public static void main(String[] args) {		
		// TODO Auto-generated constructor stub
		List rawList = new ArrayList();
		List<String> list = new ArrayList<>();
		
		rawList = list;
		rawList.add("vcvxc");
		rawList.add(8);
		
		String s = list.get(0);
		String s1 = list.get(1);
		System.out.println(s);
		
	}

}

