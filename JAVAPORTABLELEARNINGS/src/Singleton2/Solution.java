package Singleton2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
���������� Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - �������� ����������� ���� ���
    static{
    	try {
			readKeyFromConsoleAndInitPlanet();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - ���������� ������� �5 ���
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String planet = reader.readLine();
    	if(planet.contains(Planet.SUN)){
    		thePlanet = Sun.getInstance(); 
    		thePlanet.getRadius();
    	}
    	else if(planet.contains(Planet.EARTH)){
    		thePlanet = Earth.getInstance();

    	}
    	else if(planet.contains(Planet.MOON)){
    		thePlanet = Moon.getInstance();
    	}
    	else{
    		thePlanet = null;
    	}
    }
    
    
    
    
}
