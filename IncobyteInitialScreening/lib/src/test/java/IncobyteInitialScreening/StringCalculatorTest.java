package IncobyteInitialScreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	StringCalculator stringCalc;

	@BeforeEach
	void init() {
		stringCalc = new StringCalculator();
	}

	@Test
	@DisplayName("Test Add Method with Empty String")
	void TestAddWithEmptyString() {
		assertEquals(0, stringCalc.add(""));
	}

	@Test
	@DisplayName("Test Add Method with String having one number")
	void TestAddWithOneNumber() {
		assertEquals(5, stringCalc.add("5"));
	}

	@Test
	@DisplayName("Test Add Method with String having two numbers")
	void TestAddWithTwoNumbers() {
		assertEquals(5, stringCalc.add("3,2"));
	}

	@Test
	@DisplayName("Test Add Method with String having three numbers")
	void TestAddWithThreeNumbers() {

		assertEquals(9, stringCalc.add("1,3,5"));
	}

	@Test
	@DisplayName("Test Add Method with String having unknown numbers")
	void TestAddWithUnknownNumbers() {
		assertEquals(16, stringCalc.add("1,3,5,6,1"));
	}

	@Test
	@DisplayName("Test Add Method with String having unknown numbers seperated by new line and commas")
	void TestAddWithNumbersSeperatedByCommasAndNewLine() {
		assertEquals(16, stringCalc.add("1,3\n5,6,1"));
	}

	@Test
	@DisplayName("Test Add Method with String having unknown numbers seperated by new line instead of commas")
	void TestAddWithNumbersSeperatedByNewLine() {
		assertEquals(16, stringCalc.add("1\n3\n5\n6\n1"));
	}

	@Test
	@DisplayName("Test Add Method with String having unknown numbers split by custom delimiter")
	void TestAddWithNumbersSeperatedCustomDelimiter() {
		assertEquals(3, stringCalc.add("//;\n1;2"));
	}

	@Test
	@DisplayName("Test Add Method to throw exception if number is negative")
	void TestAddWithNegativeNumbers() {
		Exception e = assertThrows(RuntimeException.class, () -> stringCalc.add("-1,-2,3,4"));
		assertEquals(e.getMessage(), "Negatives not allowed: -1 -2 ");
	}

}
