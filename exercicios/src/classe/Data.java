package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public String obterDataFormatada() {
		return String.format("%s/%s/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
