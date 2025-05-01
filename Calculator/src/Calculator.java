// Faris
public class Calculator {
 public double add(double a, double b) { 
	 return a + b;
 }// end add
 
 public double subtract(double a, double b) { 
	 return a - b; 
 }// end subtract

 public double multiply(double a, double b) { 
	 return a * b; 
 }// end multiply
 
 public double divide(double a, double b) { 
	 
	 if( b==0) {// Divide by Zero is illegal
		 throw new IllegalArgumentException("Divide by zero failed."); 
	 }// end if
	 return a / b; 
 }// end divide 
 
 public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}//end fibonacci()

 
}// end calculator class
