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
				
		System.out.printf("%s/%s/%d\n", data1.dia, data1.mes, data1.ano );	
		System.out.printf("%s/%s/%d\n", data2.dia, data2.mes, data2.ano );
	}
}
