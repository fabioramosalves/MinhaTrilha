package generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(112);
		nums.add(10);
		nums.add(-4);
		nums.add(-5);
		nums.add(2);
		nums.add(1);
		nums.add(7);
		nums.add(11);
		
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
}
