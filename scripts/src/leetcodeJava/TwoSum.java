package leetcodeJava;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public List<Integer> twoSum(List<Integer> input, int target) {
		List<Integer> result = new ArrayList<>();
		Integer indexOne = 0;
		Integer indexTwo = 0;
		for(int inputOne : input) {
			for(int inputTwo : input) {
				if((inputOne + inputTwo) == target) {
					result.add(indexOne);
					result.add(indexTwo);
				}
				indexTwo ++;
			}
			indexOne ++;
			indexTwo = 0;
		}
		int size = (result.size() > 0) ? result.size()-2 : 0;
		for(int cont = 0; cont < size;cont+=2) {
			if(result.get(cont) == result.get(cont+3)) {
				result.remove(cont+3);
				result.remove(cont+2);
			}
		}
		return result;
	}
}
