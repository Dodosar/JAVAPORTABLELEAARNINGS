package RobotIssue;

import java.util.Random;

public abstract class AbstractRobot implements  Attackable,Defensable{
	
	final Random random = new Random(); 
	private int hitCount;
	
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = random.nextInt(4) + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;        	
        } else if (hitCount == 4) {
        	hitCount = 0;
        	attackedBodyPart = BodyPart.CHEST;
        }
        	
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = random.nextInt(4) + 1;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {        	
            defencedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
        	hitCount = 0;
        	defencedBodyPart = BodyPart.CHEST;
        }
        
        return defencedBodyPart;
    }

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

}



