package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars Ep 4", 8.7);
		Filme filmeB = new Filme("O Fugitivo", 9.9);

		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);

		DAO<Object> dao = new DAO<>();
		
		dao.addAtomic(filmeA).close();
	}
}
