
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculator calc = new Calculator();
		 double a = 5;
		 double b = 2;
		 //double total = calc.add(a, b);
		 //double output = calc.add(2, 2);
		 
		 //double total = calc.subtract(a, b);
		 //double total = calc.multiply(a, b);
		 double total = calc.divide(a, b);
		 System.out.printf("%.2f / %.2f = %.2f\n",a,b,total);

	}// end main method

}// end main class
