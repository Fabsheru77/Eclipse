import java.util.concurrent.ThreadLocalRandom;

public class Elemental implements Entity {
	private String type;
	private int attackPoints;
    
    public Elemental(String type, int attackPoints) {
   	 this.type = type;
   	 this.attackPoints = attackPoints;
    }
    
    public String getType() {
   	 return this.type;
    }

    public boolean disappears() {
   	 int num = ThreadLocalRandom.current().nextInt(0,8);
   	 
   	 if(num > 5) {//a 1/3 chance of disappearing at any time.
   		 return true;
   	 }else {
   		 return false;
   	 }
    }

    public int attacks()
    {//will return a random number from zero to attackPoints
   	 int myReturn = ThreadLocalRandom.current().nextInt(0, this.attackPoints + 1);
   	 return myReturn;
    }
    
    public String defends(int damage)
    {//Elementals can't be harmed
   	 return "The " + this.type + " is unharmed!\n";
    }
    
    @Override
    public String toString() {
   	 return "Elemental [type=" + type + ", attackPoints=" + attackPoints + "]";
    }

}
