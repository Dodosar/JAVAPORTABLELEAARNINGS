package AbstractClass;

public class Issue7 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));
    }

    static class Today implements Weather,WeatherType{
        private String type;

        Today(String type) {
            this.type = type;
        }
        

        @Override
        public String toString() {
            return String.format("%s for today", this.getWeatherType());
        }

		@Override
		public String getWeatherType() {
			// TODO Auto-generated method stub
			return type;
		}
    }
}
