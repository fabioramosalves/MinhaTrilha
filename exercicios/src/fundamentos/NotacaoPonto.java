package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		//double a = 2.3;
		
		String s = "Bom dia X";
		
		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		
		s = s.concat(" !!!");
		
		System.out.println(s);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat(" !!!");
		
		System.out.println(y);	
		
		
		//tipos primitivos não tem o operador ponto
		
		//int integerNumber = 3;
	
		//integerNumber. não tem ponto.
	}
}
