import java.util.HashMap;
import java.util.Map;


public class Pet {
	
	protected String patName;
	
	public static void main(String args[]){

	Map<String, Pet> hashMap = new HashMap<>();

	hashMap.put("���", new Cat("������"));
	hashMap.put("������", new Dog("�����"));
	hashMap.put("�������", new Parrot("����"));
	System.out.println(hashMap);
	Pet cat = hashMap.get("���");
	System.out.println(cat);
	System.out.println(hashMap.containsKey("���"));
	System.out.println(hashMap.containsValue(cat));

}
	
	
	public   String   toString()
	{
		return patName;
	}
}
