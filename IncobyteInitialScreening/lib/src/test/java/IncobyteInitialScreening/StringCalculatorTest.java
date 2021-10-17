package IncobyteInitialScreening;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

		@Test
		@DisplayName("Test Add Method with Empty String")
		void TestAddWithEmptyString() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(0, stringCalc.add(""));
		}

		
		@Test
		@DisplayName("Test Add Method with String having one number")
		void TestAddWithOneNumber() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(5, stringCalc.add("5"));
			
		}

		@Test
		@DisplayName("Test Add Method with String having two numbers")
		void TestAddWithTwoNumber() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(5, stringCalc.add("3,2"));
			
		}
		
		
		
}
