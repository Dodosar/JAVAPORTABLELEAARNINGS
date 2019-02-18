package Instanceof;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //������ � ������� ��������� ������ (�����), ����� 7

        /*
8 ������� ���������� movie ������ Movie � ��� ������ ��������� ������(�����):
8.1 �������� ������ ��������� MovieFactory.getMovie � ��������� ��� ���������� movie
8.2 ������� �� ����� movie.getClass().getSimpleName()

	*/

    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	Boolean valid = true;
    	while(valid){
    		String tvShow = reader.readLine();
    		Movie movie = MovieFactory.getMovie(tvShow);
    		if(movie == null){
    			valid = false;
    			break;
    		}
    		else{
    			System.out.println(movie.getClass().getSimpleName());
    		}
    	}
   }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //�������� ������� SoapOpera (������� �����) ��� ����� "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if("cartoon".equals(key)){
            	movie = new Cartoon();
            }
            else if("thriller".equals(key)){
            	movie = new Thriller();
            }
            //�������� ��� ��� ���, ������ 5,6

            return movie;
        }
    }

    static abstract class Movie {
    	
    }

    static class SoapOpera extends Movie {
    	
    }

    //�������� ��� ���� ������, ����� 3
    static class Cartoon  extends Movie {
    	
    	
    }
    
    static class Thriller  extends Movie {
    	
    	
    }
}
