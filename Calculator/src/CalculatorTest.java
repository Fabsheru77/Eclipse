import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}// end throw Exception

	@Test
	@DisplayName("Simple Addition")
	void testAdd() {
		assertEquals( 2.5, calculator.add(1, 1.5), "Simple Addition failed");
	}// end test add()
		
	@RepeatedTest(5)
	@DisplayName("Simple subtraction")
	void testSubtract() {
		assertEquals( 2, calculator.subtract(7, 5), "Simple subtraction failed");
	}// end testSubtract()
	
	@Test
	@DisplayName("Simple multiplication")
	void testMultiply() {
		assertEquals( 35, calculator.multiply(7, 5), "Simple multiplication failed");	
	}// end testMultiply()

	@Test
	@DisplayName("Simple division")
	void testDivide() {
		assertEquals( 2, calculator.divide( 10, 5 ), "Simple division failed");	
		assertEquals( 2, calculator.divide( 4, 2 ), "Simple division failed, 4/2");
	}// end testDivide()

	@Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void divideByZero() {
   	 Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
   	 assertEquals("Divide by zero failed.", exception.getMessage());
    }// end divide by Zero()
	
    @Test
    @DisplayName("Ensure Fibonacci computation is 'fast enough'")
    void testFibonacci() {
   	 // f(42) - f(45) will likely take longer than 1000 ms.
   	 assertTimeoutPreemptively(Duration.ofMillis(1000), () -> calculator.fibonacci(30),"Ensure Fibonacci computation is 'fast enough'");
    }

}// end class CalculatorTest Main method
