import java.util.HashMap;
import java.util.Map;


public class Pet {
	
	protected String patName;
	
	public static void main(String args[]){

	Map<String, Pet> hashMap = new HashMap<>();

	hashMap.put("Кот", new Cat("Мурзик"));
	hashMap.put("Собака", new Dog("Бобик"));
	hashMap.put("Попугай", new Parrot("Кеша"));
	System.out.println(hashMap);
	Pet cat = hashMap.get("Кот");
	System.out.println(cat);
	System.out.println(hashMap.containsKey("Кот"));
	System.out.println(hashMap.containsValue(cat));

}
	
	
	public   String   toString()
	{
		return patName;
	}
}
