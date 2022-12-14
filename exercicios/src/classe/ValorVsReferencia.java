package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);

		Data d1 = new Data(1, 6, 2022);

		var d2 = d1;

		d1.dia = 31;
		d2.dia = 12;

		d1.ano = 2025;

		System.out.printf("%s %s \n", d1.obterDataFormatada(), d2.obterDataFormatada());

		voltarDataParaValorPadra(d1);

		System.out.printf("%s %s \n", d1.obterDataFormatada(), d2.obterDataFormatada());
		
		
		int c = 5;
		alterarPrimitivo(c);
		
		int x = alterarPrimitivoReturn(c);
		
		System.out.println(x);
		System.out.println(c);	
	}

	static void voltarDataParaValorPadra(Data data) {
		data.dia = 1;
		data.mes = 1;
		data.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
	
	static int alterarPrimitivoReturn(int a) {
		return a++;
	}
}
