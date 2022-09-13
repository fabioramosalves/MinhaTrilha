package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String obterDataFormatada() {
		return String.format("%s/%s/%d", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
