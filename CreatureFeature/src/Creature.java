import java.util.concurrent.ThreadLocalRandom;

public abstract class Creature implements Entity {
	
	private String creatureType; //what is the nature of the creature, dragon, human, etc.
	private int hitPoints; //amount of damage a creature can withstand
	private int attackPoints; //how much damage creature could inflict
	private int gold; //material value of creature
	private boolean alive = true; //whether the creature is still alive or not
	
	public Creature(String creatureType, int hitPoints, int attackPoints, int gold) {
		this.creatureType = creatureType;
		this.hitPoints = hitPoints;
		this.attackPoints = attackPoints;
		this.gold = gold;
		//this.alive = alive;
	}// end constructor
	
	public int attacks()
	{//will return a random number from zero to attackPoints
  	  int myReturn = ThreadLocalRandom.current().nextInt(0, this.attackPoints + 1);
  	  return myReturn;
	}//end attacks()

	 public String defends(int damage)
	    {//take the damage assessed to the current creature, and provide feedback
	   	 String myReturn = "";
	   	 
	   	 if(this.assessDamage(damage)){//still alive!
	   		 myReturn += this.creatureType + " was attacked and took " + damage + " damage and ";
	   		 myReturn += "has " + this.hitPoints + " hit points left!\n";
	   	 }else {//oh oh!
	   		 myReturn += this.creatureType + " was attacked and took " + damage + " damage and is dead!\n";
	    	}
	   	 return myReturn;
	    }//end defends()



	public boolean assessDamage(int ap)
	{
  	  //take the current hitPoints, and subtract the attackPoints
  	  this.hitPoints -= ap;
  	  //if HP goes below zero, creature is dead
  	  if (this.hitPoints < 1)
  	  {//game over!
  		  this.alive = false;
  		  this.hitPoints = 0;
  		  return false;
  	  }else {
  		  return true;
  	  }
	}//end assessDamage()


	public String getCreatureType() {
		return creatureType;
	}

	public void setCreatureType(String creatureType) {
		this.creatureType = creatureType;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public int getGold() {
		return gold;
	}// end getGold

	public void setGold(int gold) {
		this.gold = gold;
	}// end setGold

	public boolean isAlive() {
		return alive;
		
	}// end isAlive

	public void setAlive(boolean alive) {
		this.alive = alive;
	}// end set Alive

	@Override
	public String toString() {
		return "Creature [creatureType=" + creatureType + ", hitPoints=" + hitPoints + ", attackPoints=" + attackPoints
				+ ", gold=" + gold + ", alive=" + alive + "]";
		
	}// end OverRide
	

}// end Creature class
