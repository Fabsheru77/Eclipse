
public class Hero extends Creature {
	String name; // name of adventure 
	String character; // Type of adventure, wizard, fighter, etc
	
	public Hero(String name, String character, int hitPoints, int attackPoints) {
		super("hero", hitPoints, attackPoints, 0);
		this.name = name;
		this.character = character;
		
		// TODO Auto-generated constructor stub
		
	}// end Constructor
	
	 @Override
	    public String defends(int ap) {
	   	 return this.name + " the " +  this.character + " " + super.defends(ap);
	    }//end defends()

	
	public String getName() {
		return name;
	}
	
	   @Override
	    public String toString() {
	   	 String str = super.toString();
	   	 str = str.substring(str.indexOf("[")+1);
	   	 return "Hero [name=" + name + ", character=" + character + ", " + str;
	    }// end toString


}// end class
