package Exceptions2;

import Exception1.BmpReader;
import Exception1.ImageReader;
import Exception1.ImageTypes;
import Exception1.JpgReader;
import Exception1.PngReader;

public class ImageReaderFactory extends IllegalArgumentExceptionClass implements
		ImageReader {
	public static ImageReader getImageReader(ImageTypes type)
			throws IllegalArgumentException {
		ImageReader a = null;
		try {
			if (type == ImageTypes.JPG) {
				a = new JpgReader();
			} else if (type == ImageTypes.BMP) {
				a = new PngReader();
			} else if (type == ImageTypes.PNG) {
				a = new BmpReader();
			} else {
				IllegalArgumentExceptionClass a1 = new IllegalArgumentExceptionClass();
			}
		} catch (IllegalArgumentException a1) {
			/* System.out.println(a1.getMessage()); */
			throw new IllegalArgumentException("Exception 2 test");
		}
		return a;
	}
}
