   import java.util.concurrent.ThreadLocalRandom;
   import io.github.fabsheru77.Prompts;
  
  
 /*   
    let num = Math.floor(Math.random() * 10) + 1;

       let guess = prompt("guess a number between 1 and 10");

       let gotIt = false;//sets the loop - if true, break out of the loop

       let counter = 0;//keep track of the number of guesses

       let feedback = ""; //output for user

     let timeTimes = "times";// the plural form of time
 */ 


   public class Main {
	public static void main(String[] args) {
		// Generate a random number between 1 and 10
		int num = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		
		//	let guess = prompt("guess a number between 1 and 10");
		int guess = Prompts.getInt(" Guess a number between 1 and 10 ");
		
		boolean gotIt = false;//sets the loop - if true, break out of the loop

	      int counter = 0;//keep track of the number of guesses

	      String feedback = ""; //output for user

	     String timeTimes = "times";// the plural form of time
	     
	     while(gotIt == false){
	           counter++;
	           if(num == guess){//got it, break the loop!
	               //alert("Got it!");
	               gotIt = true;//break the loop
	           }else if(num > guess){//too low!
	               //alert("higher!");
	               guess = Prompts.getInt("higher");
	           }else{//too high!
	               //alert("lower!");
	               guess = Prompts.getInt("lower");
	           }

	       }

	       if(counter == 1){//deal with singular
	           timeTimes = "time";
	       }


	       feedback = "You got it! The number was " + num;
	       feedback += " and you guessed " + counter + " " + timeTimes;
		
		System.out.println(guess);
		
	}
	
}
