package leetcodeJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeTwoSortedLists {
	public static void show(){
		List<Integer> input1 = new ArrayList<>(List.of(1,2,4));
		List<Integer> input2 = new ArrayList<>(List.of(1,3,4));
		
		ArrayList<Integer> result = new ArrayList<>();
		
		result.addAll(input1);
		result.addAll(input2);
		result.sort(Comparator.naturalOrder());
		
		System.out.println(result.toString());
	}
}
