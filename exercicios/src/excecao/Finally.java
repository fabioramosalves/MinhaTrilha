package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		try {

			System.err.println(7 / number);

		} catch (OutOfMemoryError e) {
			System.out.println(e);
		} finally {
			System.err.println("finally... :)");
			scanner.close();
		}

		System.err.println("Fim :)");
	}
}
