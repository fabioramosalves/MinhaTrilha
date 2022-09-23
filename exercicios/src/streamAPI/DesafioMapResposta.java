package streamAPI;

import java.util.Arrays;
import java.util.List;

import myClass.Util;

public class DesafioMapResposta {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * 1. Número para string binária... 6=> "110" 
		 * 2. Reverter a string... "110" => "011" 
		 * 3. Converter de volta para inteiro => 3
		 */

		nums.stream()
			.map(Integer::toBinaryString)
			.map(Util.revertString)
			.map(Util.convertBynaryToInt)
			.forEach(Util.printlnOutInt);
	}
}
