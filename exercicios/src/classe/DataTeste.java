package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		data1.dia = 26;
		data1.mes = 1;
		data1.ano = 2022;
		
		var data2 = new Data();
		data2.dia = 14;
		data2.mes = 07;
		data2.ano = 2022;
				
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}
}
