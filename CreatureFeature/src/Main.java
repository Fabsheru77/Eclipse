import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws InterruptedException {
			
		Hero myHero = new Hero("Conan", "warrior", 15, 8);
		 Entity myElemental = new Elemental("Salamander",3);

		ArrayList<Entity> entities = new ArrayList<Entity>();

		entities.add(new Monster("Imp", "timid", 5, 2, 10));
		entities.add(new Elemental("Undine", 2));
		entities.add(new Monster("Dragon", "fierce", 10, 4, 100));
		entities.add(new Elemental("Salamander", 3));
		for (Entity entity : entities) {
			Game.fight(entity, myHero);
			
		} // end for
		
	}// end main method

}// end Main class 
