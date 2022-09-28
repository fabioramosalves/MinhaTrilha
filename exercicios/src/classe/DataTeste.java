package classe;

public class DataTeste {
	
	char teste;
	
	public static void main(String[] args) {

		Data data1 = new Data();
		
		data1.dia = 26;
		data1.mes = 1;
		data1.ano = 2022;

		var data2 = new Data(14, 07, 2022);

		var data3 = new Data();

		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
		data3.imprimirDataFormatada();
		
		
		//uma variável local não será inicializada, apenas
		//variáveis de instancia recebem um valor padrão
				
		System.out.println(new DataTeste().teste);
	}
}
