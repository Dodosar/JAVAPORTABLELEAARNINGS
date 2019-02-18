package AbstractClass;

public class Issue1 {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "� ���������� � " + getLanguage();
        }
    }
    
    public static class EnglishTranslator extends Translator{
    	@Override
    	public String getLanguage(){
    		return "�����������";
    	}
    	
    }

}