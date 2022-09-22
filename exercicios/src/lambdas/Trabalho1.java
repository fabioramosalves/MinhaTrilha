package lambdas;

public class Trabalho1 implements Runnable {

	public void run() {
		var t = GeneratePassword.generateRandomPassword(10);
		for (int i = 0; i < 10; i++) {		
			System.out.println(t);
		}
	}
}
