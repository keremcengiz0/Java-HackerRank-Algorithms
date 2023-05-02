package CompareTheTriplets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int size = 0;

		if (a.size() == b.size()) {
			size = a.size();
		}

		int[] totalPoints = new int[2];
		totalPoints[0] = 0;
		totalPoints[1] = 0;

		for (int i = 0; i < size; i++) {
			if (a.get(i) > b.get(i)) {
				totalPoints[0] += 1;
			} else if (a.get(i) == b.get(i)) {

			} else {
				totalPoints[1] += 1;
			}
		}

		List<Integer> total = Arrays.asList(totalPoints[0], totalPoints[1]);

		return total;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result.compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
