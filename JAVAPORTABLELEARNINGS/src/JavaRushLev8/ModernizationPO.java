package JavaRushLev8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class ModernizationPO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String,String> addresses = new HashMap<String,String>();
        while (true) {
            String city = reader.readLine();
            String family = reader.readLine();
            if (family.isEmpty()|| city.isEmpty()) break;

            addresses.put(city,family);
        }

        //read home number
        System.out.println("EnterCity");
        String EnterValue = reader.readLine();
        
        String familySecondName = addresses.get(EnterValue);
        System.out.println(familySecondName);
        
       
    }
}