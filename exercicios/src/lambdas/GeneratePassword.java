package lambdas;

import java.security.SecureRandom;

public final class GeneratePassword {
	
	public final static String generateRandomPassword(int len) {
		// intervalo ASCII – alfanumérico (0-9, a-z, A-Z)
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		// cada iteração do loop escolhe aleatoriamente um caractere do dado
		// intervalo ASCII e o anexa à instância `StringBuilder`

		for (int i = 0; i < len; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();
	}
}
