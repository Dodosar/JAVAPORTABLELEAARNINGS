
public enum Area {
     Moscow("Russia"),Minsk("Belarus"),Kiev("Ukraine"),Odessa("Ukraine"),Voronesh("Russia"),Other("");
private String country;

Area(String country){
	this.country = country;
}

public String getCountry(){
	return country;
}

}


