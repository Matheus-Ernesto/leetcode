package leetcodeJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Two Sum
		TwoSum twoSum = new TwoSum();
		List<Integer> input = new ArrayList<>(List.of(0,1,2,3));
		int target = 5;
		List<Integer> outputs = twoSum.twoSum(input, target);
		System.out.println(outputs.toString());
	}
}
