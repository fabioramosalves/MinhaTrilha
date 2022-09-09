package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		
	    // se apenas 1 der certo TV 32
		// se os 2 derem certo TV 50
		
		boolean trabalhoTerca = false;
	    boolean trabalhoQuinta = false;
	    
	    boolean TV50 = trabalhoTerca && trabalhoQuinta;
	    boolean TV32 = trabalhoTerca ^ trabalhoQuinta;
	    boolean sorvete = trabalhoTerca || trabalhoQuinta;
	    
	    boolean maisSaudavel = !sorvete;
	    
	    System.out.println("TV 50 " + TV50);
	    System.out.println("TV 32 " + TV32);
	    System.out.println("Sorvete " + sorvete);
	    System.out.println("Mais saudável " + maisSaudavel);
	}
}
