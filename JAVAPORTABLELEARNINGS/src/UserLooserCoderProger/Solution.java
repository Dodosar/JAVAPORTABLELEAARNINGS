package UserLooserCoderProger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        Boolean valid = true;

        //тут цикл по чтению ключей, пункт 1
        while(valid)
        {	
        	key = reader.readLine();
        	switch(key) {
        	case "user":
        		 person = new Person.User();
        		 doWork(person);
        		 break;        	
        	case "loser":
        		person = new Person.Loser();
        		doWork(person);
        		break;        	
        	case "coder":
        		person = new Person.Coder();
        		doWork(person);
        		break;        	
        	case "proger":
        		person = new Person.Proger();
        		doWork(person);
        		break;
        	default:
        		person = null;
        		reader.close();
        		valid = false;
        		break;        		
        	}
             //вызываем doWork            
                  
        }
    }

    public static void doWork(Person person) {
        // пункт 3
    	if(person instanceof Person.User){
    		((Person.User) person).live();
    	}
    	else if(person instanceof Person.Loser){
    		((Person.Loser) person).doNothing();
    	}
    	else if(person instanceof Person.Coder){
    		((Person.Coder) person).coding();
    	}
    	else if(person instanceof Person.Proger){
    		((Person.Proger) person).enjoy();
    	}
    	
    }
}
