package JavaRushLev8;

import java.util.HashMap;
import java.util.Map;

/* 
��� ������� �� �����
*/

public class RemoveTheSameName {
    public static HashMap<String, String> createMap() {
        //�������� ��� ��� ���
        HashMap<String,String> map = new HashMap<String,String>();
        for(int i = 0 ; i < 10; i++){
            map.put("Tom"+i,"Dugan"+i);
        }
		return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //�������� ��� ��� ���
        removeItemFromMapByValue(map,"Dugan1");
        System.out.println(map);
        }

    

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
		removeTheFirstNameDuplicates(createMap());
    }
}
