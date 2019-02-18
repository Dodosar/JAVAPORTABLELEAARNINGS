package Exceptions2;

import Exception1.ImageReader;
import Exception1.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        
			try {
				ImageReader reader = ImageReaderFactory.getImageReader(null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				System.out.println(e.getLocalizedMessage());
				e.printStackTrace();
			}
		
    }
}

