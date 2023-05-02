package SimpleArraySum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Stream;

class Result {

	public static int simpleArraySum(List<Integer> ar) {
		int total = 0;
		for (Integer number : ar) {
			total += number;
		}

		return total;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Result.simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

/*
 * class Result {
 * 
 * public static int simpleArraySum(List<Integer> ar) { int total = 0; for
 * (Integer number : ar) { total += number; }
 * 
 * return total; }
 * 
 * }
 * 
 * public class Solution { public static void main(String[] args) throws
 * IOException {
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * int arCount = Integer.parseInt(in.nextLine().trim()); List<Integer> ar = new
 * ArrayList<>();
 * 
 * for (int i = 0; i < arCount; i++) {
 * ar.add(Integer.parseInt(in.nextLine().replaceAll("\\s+$", ""))); }
 * 
 * int result = Result.simpleArraySum(ar);
 * 
 * System.out.println(result);
 * 
 * in.close(); } }
 */