
import java.io.*;
import java.lang.Thread;

public class Game {

	public static void fight(Entity entity, Hero myHero) throws InterruptedException {
		boolean gameOn = true;//will become false when a creature dies
		
		int counter = 0; //will allow us to use modulus to take turns
		
		String output = "";//use for optional output to screen
		
		while(gameOn) {
			
		if(entity instanceof Elemental) {// Elemental
			Elemental elemental = Elemental.class.cast(entity);
			
		if(elemental.disappears()){ // True Elemental disappears
				System.out.println("The elemental disappears!");
			}else {// elemental attacks
				System.out.println(myHero.defends(elemental.attacks()));
				
			}// end if
					
		if(!myHero.isAlive()) {
			gameOn = false;
			break;
			
		}// end if
						
		}else {// Monster
			Monster myMonster = Monster.class.cast(entity);		
			
			if(counter % 2 == 0) {//hero turn
				System.out.println(myMonster.defends(myHero.attacks()));
			}else {//monster turn
				System.out.println(myHero.defends(myMonster.attacks()));
			}
			
			if(!myHero.isAlive() || !myMonster.isAlive()){//someone is dead, game over!
				
				if(myHero.isAlive()) {//time for gold!
					myHero.setGold(myHero.getGold() + myMonster.getGold());
					output = "Our Hero " + myHero.name + " got " + myMonster.getGold() + " gold and now has a total of " + myHero.getGold() + " gold.";
					System.out.println(output);
				}
				gameOn = false;
			}//end if
			
			counter++;
			Thread.sleep(1000);
			
		} // end if
					
		}//end while
	}//end main()
}//end Game class
