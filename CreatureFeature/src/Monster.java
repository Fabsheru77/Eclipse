// Faris
public class Monster extends Creature {
	String mode; // fierce, timid or chaotic 
	
	public Monster(String CreatureType, String mode, int hitPoints, int attackPoints, int gold) {
		super(CreatureType, hitPoints, attackPoints, gold);
		this.mode = mode;
	}// end constructor
	
	
	@Override
    public String defends(int ap) {
   	 return "The " +  this.mode + " " + super.defends(ap);
    }//end defends()

	
	   @Override
	    public String toString() {
	   	 String str = super.toString();
	   	 str = str.substring(str.indexOf("[")+1);
	   	 return "Monster [mode=" + mode +  ", " + str;
	   	 
	    }// end to String / OverRide

}// end class
