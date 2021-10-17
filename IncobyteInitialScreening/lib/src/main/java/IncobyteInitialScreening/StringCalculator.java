package IncobyteInitialScreening;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

	public int add(String string) {
		if (!string.isEmpty()) {

			List<Integer> numbers = stringArraytoIntegerList(getSplit(string));
			return numbers.stream().reduce(Integer::sum).orElseThrow();
		}

		return 0;
	}

	private List<Integer> stringArraytoIntegerList(String[] stringArray) {
		return Arrays.stream(stringArray).map(Integer::parseInt).collect(Collectors.toList());
	}

	private String[] getSplit(String string) {
		return string.split(",|\n");
	}

}
