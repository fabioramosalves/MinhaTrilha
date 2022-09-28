package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.modelo.Campo;


public class CampoTeste {

	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void testeVisinhoRealDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVisinhoRealDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVisinhoRealDistancia1Acima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVisinhoRealDistancia1Abaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	// Validando diagonal

	@Test
	void testeVisinhoRealDistancia2DireitaEmbaixo() {

		Campo vizinho = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVisinhoRealDistancia2DireitaEmcima() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVisinhoRealDistancia2EsquerdaEmbaixo() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVisinhoRealDistancia2EsquerdaEmcima() {
		Campo vizinho = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeNaoVisinho() {
		Campo vizinho = new Campo(4, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}

	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacaoDuasVezes() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}

	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> campo.abrir());
	}

	@Test
	void testeAbrirComVizinhos1() {

		Campo campo11 = new Campo(1, 1);

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);

		campo.adicionarVizinho(campo22);

		campo.abrir();

		assertTrue(campo22.isAberto() && campo11.isAberto());
	}

	@Test
	void testeAbrirComVizinhos2() {

		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo12.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);

		campo.adicionarVizinho(campo22);

		campo.abrir();

		assertTrue(campo22.isAberto() && campo11.isFechado());
	}

	@Test
	void testeGetLinha() {
		Campo campo = new Campo(1, 1);

		assertTrue(campo.getLinha() == 1 && campo.getColuna() == 1);
	}

	@Test
	void testeReiniciar() {

		campo.reiniciar();

		assertTrue(campo.isFechado() && !campo.isMarcado() && !campo.isMinado());
	}
	
	@Test
	void testeTostring() {
		assertTrue(campo.toString().equals("?"));
	}
	@Test
	void testeTostringMinar() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo12.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);

		campo.adicionarVizinho(campo22);

		campo.abrir();
		assertTrue(campo.toString().equals(" "));
	}
	@Test
	void testeTostringFechadoMinado() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo12.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);

		assertTrue(campo22.toString().equals("?"));
	}
	
	@Test
	void testeTostringAbertoMinado() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo11.abrir();
		campo11.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		assertTrue(campo11.toString().equals("*"));
	}
	
	@Test
	void testeTostringAbertoMinadoNaVizinhanca1() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo11.abrir();
		campo12.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo22.abrir();
		
		assertTrue(campo22.toString().equals("1"));
	}
	@Test
	void testeTostringAbertoMinadoNaVizinhanca2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo12.minar();
		campo11.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo22.abrir();
		
		assertTrue(campo22.toString().equals("2"));
	}
	
	
	
	@Test
	void testeObjetivoAlcancado() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);

		campo12.minar();
		campo11.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo22.abrir();
		
		assertTrue(campo22.objetivoAlcancado());
	}
	
	
	@Test
	void testeToStringMarcar() {
		Campo campo12 = new Campo(1, 2);

		campo12.alternarMarcacao();
	
		assertTrue(campo12.toString().equals("x"));
	}
	
	
	@Test
	void testeIsFechado() {
		Campo campo12 = new Campo(1, 2);
		campo12.abrir();
		assertFalse(campo12.isFechado());
	}
}
