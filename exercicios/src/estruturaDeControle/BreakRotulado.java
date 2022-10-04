package estruturaDeControle;

public class BreakRotulado {
	public static void main(String[] args) {

		
		 for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break ; // break rotulado sai do fluxo do laço nomeado;
				}
				System.out.printf("[%d , %d] ", i, j);
			}

			System.out.println();
		}
		
		 System.out.println("\n-------Fim-------\n");
		 
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break externo; // break rotulado sai do fluxo do laço nomeado;
				}
				System.out.printf("[%d , %d] ", i, j);
			}

			System.out.println();
		}
	}
}
