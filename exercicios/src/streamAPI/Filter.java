package streamAPI;

import java.util.Arrays;
import java.util.List;

import myClass.Util;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,2,4,7,8,7,6,1);
		
		numbers.stream()
		   .filter(n -> n % 2 == 0).forEach(Util.printlnOutInt);
		
	}
}
