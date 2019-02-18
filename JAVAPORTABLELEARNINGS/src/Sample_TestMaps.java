import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Sample_TestMaps{
  public static void main(String[] args){
    Map<String, String> objMap = new HashMap<String, String>();
    objMap.put("Name", "Suzuki");
    objMap.put("Power", "220");
    objMap.put("Type", "2-wheeler");
    objMap.put("Price", "85000");
    System.out.println("Elements of the Map:");
    System.out.println(objMap);
    System.out.println(objMap.keySet());
    System.out.println(objMap.values());
    System.out.println(objMap.remove("Type"));
    System.out.println(objMap. isEmpty());
    for (String key : objMap.keySet()) {
        System.out.println("Key: " + key);
    }
    for (Map.Entry entry : objMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + " Value: "
            + entry.getValue());
    }
    System.out.println("----------------------------------------------------------------------------");
 // �������� ���-��������
    Map<String, Integer> hashMap = new HashMap<>();

    // �������� ������ �� ��������
    hashMap.put("������", 6);
    hashMap.put("������", 8);
    hashMap.put("�����", 12);
    hashMap.put("������", 5);

    // �������� ����� ���������
    Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

    // ��������� �����
    for (Map.Entry<String, Integer> me : set) {
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
    }

    // ��������� ��������
    int value = hashMap.get("�����");
    hashMap.put("�����", value + 3);
    System.out.println("� ������ ����� " + hashMap.get("�����"));
  }
}