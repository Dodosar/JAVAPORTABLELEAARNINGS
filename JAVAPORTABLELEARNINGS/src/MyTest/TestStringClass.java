package MyTest;

public class TestStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		String b = "abcd";
		String c = "abcf";
		

		
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo("abcd"));
		
		
		StringBuilder s = new StringBuilder();
		
		s.append(a).append(c).append(b).append(10.2);
		System.out.println(s.toString());
	

	}

}
