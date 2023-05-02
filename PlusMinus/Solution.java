package PlusMinus;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	public static void plusMinus(List<Integer> arr) {
		int positive = 0;
		int negative = 0;
		int zero = 0;
		int size = arr.size();

		for (Integer number : arr) {
			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			} else {
				zero++;
			}
		}

		double positiveResult = (double) positive / size;
		double negativeResult = (double) negative / size;
		double zeroResult = (double) zero / size;

		System.out.println(String.format("%.6f", positiveResult));
		System.out.println(String.format("%.6f", negativeResult));
		System.out.println(String.format("%.6f", zeroResult));

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
