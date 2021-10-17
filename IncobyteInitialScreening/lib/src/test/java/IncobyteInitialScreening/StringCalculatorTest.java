package IncobyteInitialScreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
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

	@Test
	@DisplayName("Test Add Method with String having unknown numbers seperated by new line instead of commas")
	void TestAddWithNumbersSeperatedByNewLine() {
		StringCalculator stringCalc = new StringCalculator();
		assertEquals(16, stringCalc.add("1\n3\n5\n6\n1"));
	}

	@Test
	@DisplayName("Test Add Method with String having unknown numbers split by custom delimiter")
	void TestAddWithNumbersSeperatedCustomDelimiter() {
		StringCalculator stringCalc = new StringCalculator();
		assertEquals(3, stringCalc.add("//;\n1;2"));
	}

	@Test
	@DisplayName("Test Add Method to throw exception if number is negative")
	void TestAddWithNegativeNumbers() {
		StringCalculator stringCalc = new StringCalculator();
		Exception e = assertThrows(RuntimeException.class, ()-> stringCalc.add("-1,-2,3,4"));
		assertEquals(e.getMessage(), "Negatives not allowed: -1 -2 ");
	}

}
