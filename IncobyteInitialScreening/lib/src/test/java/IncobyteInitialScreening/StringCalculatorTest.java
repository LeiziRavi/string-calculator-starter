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
		void TestAddWithTwoNumbers() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(5, stringCalc.add("3,2"));
			
		}

		@Test
		@DisplayName("Test Add Method with String having three numbers")
		void TestAddWithThreeNumbers() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(9, stringCalc.add("1,3,5"));
			
		}

		@Test
		@DisplayName("Test Add Method with String having unknown numbers")
		void TestAddWithUnknownNumbers() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(16, stringCalc.add("1,3,5,6,1"));
		}

		@Test
		@DisplayName("Test Add Method with String having unknown numbers seperated by new line and commas")
		void TestAddWithNumbersSeperatedByCommasAndNewLine() {
			StringCalculator stringCalc = new StringCalculator();
			assertEquals(16, stringCalc.add("1,3\n5,6,1"));
		}
		
		
		
		
		
}
