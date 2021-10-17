package IncobyteInitialScreening;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {

	public int add(String string) {
		if (!string.isEmpty()) {
			List<Integer> numbers = stringArraytoIntegerList(getSplit(string));
			negatives(numbers);
			return numbers.stream().reduce(Integer::sum).orElseThrow();
		}

		return 0;
	}

	private void negatives(List<Integer> numbers) {
		StringBuilder stringBuilder = new StringBuilder();
		numbers.stream().filter(num -> num < 0).forEach(num -> stringBuilder.append(num).append(" "));
		if (!stringBuilder.toString().isEmpty()) {
			throw new IllegalArgumentException("Negatives not allowed: " + stringBuilder.toString());
		}

	}

	private List<Integer> stringArraytoIntegerList(String[] stringArray) {
		return Arrays.stream(stringArray).map(Integer::parseInt).collect(Collectors.toList());
	}

	private String[] getSplit(String string) {
		if (string.startsWith("//")) {
			Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(string);
			if (matcher.matches()) {
				String delimiter = matcher.group(1);
				String toSplit = matcher.group(2);
				return toSplit.split(delimiter);
			}
			throw new RuntimeException("Wrong format for custom exception.");
		}
		return string.split(",|\n");
	}

}
