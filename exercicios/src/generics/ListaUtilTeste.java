package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS","PHP","Java","C#");
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLinguagem = (String)ListaUtil.getUltimoObject(langs);//precisa de casting
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer)ListaUtil.getUltimoObject(nums);//precisa de casting
		System.out.println(ultimoNumero);
		
		String ultimaLinguagem2 = ListaUtil.getUltimoGenerico(langs);//infere sem precisar especificar
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.getUltimoGenerico(nums);//infere sem precisar especificar
		System.out.println(ultimoNumero2);
		
	}
}
