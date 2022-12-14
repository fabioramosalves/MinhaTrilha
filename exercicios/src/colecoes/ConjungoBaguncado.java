package colecoes;

import java.util.HashSet;
import java.util.Set;

import classe.Data;

public class ConjungoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })//desmarca as advertencia gerada pelo SDK
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double (conversão automática)
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		Data data = new Data();
		conjunto.add(data);

		conjunto.add("Teste");

		System.out.println(conjunto);

		System.out.println("Tamanho do conjunto é " + conjunto.size());

		System.err.println(conjunto.remove("teste"));
		System.err.println(conjunto.remove("teste"));// retorna false porque já foi removido!

		System.err.println(conjunto.remove(data));

		System.out.println(conjunto);

		System.out.println(conjunto.contains(data));// false porque foi removido
		System.out.println(conjunto.contains("Teste")); // true

		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		
		//nums.addAll(conjunto); //união entre dois conjuntos
		//System.out.println(nums);
		
		nums.retainAll(conjunto); //interseção dos conjuntos nums e conjunto
		
		System.out.println(nums);	
		
		conjunto.clear();
		System.out.println(conjunto); // limpar a HashSet
		
	}
}
