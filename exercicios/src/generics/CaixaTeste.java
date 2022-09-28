package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();   
		caixaA.guardar("Teste");
		System.out.println(caixaA.abrir()); 
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(20.0);
		System.out.println(caixaB.abrir());
		
		Caixa<Produto> caixaC = new Caixa<>();
		caixaC.guardar(new Produto("Caneta",7.88));
		System.out.println(caixaC.abrir());
	}
}
