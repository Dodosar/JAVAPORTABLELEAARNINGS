
public enum Type {
          Begginer(0),NormalUser(10),ExperienceUser(20),Admin(50);
          
          private int reiting;
          
          Type (int reiting){
        	  this.reiting = reiting;
          }
          
          public int gerReiting(){
			return reiting;
        	
          }
}
