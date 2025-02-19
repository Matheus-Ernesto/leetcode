package leetcodeJava;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public static void show() {
		List<Integer> input = new ArrayList<>(List.of(0,1,2,3));
		int target = 5;
		
		List<Integer> result = new ArrayList<>();
		
		for(Integer index1=0; index1 < input.size(); index1++) {
			for(Integer index2=index1; index2 < input.size(); index2++) {
				Integer value = input.get(index1) + input.get(index2);
				if(value == target) {
					result.add(index1);
					result.add(index2);
				}
			}
		}
		
		System.out.println(result.toString());
	}
	
}
