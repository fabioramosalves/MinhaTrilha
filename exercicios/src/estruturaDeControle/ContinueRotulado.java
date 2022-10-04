package estruturaDeControle;

public class ContinueRotulado {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					continue; 
				}
				System.out.printf("[%d , %d] ", i, j);
			}

			System.out.println();
		}

		System.out.println("\n-------Fim-------\n");

		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					continue externo; // continue rotulado sai do fluxo do laço nomeado;
				}
				System.out.printf("[%d , %d] ", i, j);
			}

			System.out.println();
		}
	}
}
