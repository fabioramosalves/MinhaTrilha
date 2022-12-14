package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		// retorna o elemento da pilha
		System.out.println(livros.peek()); // retorna null
		System.out.println(livros.element()); // lança exceção

		for (String string : livros) {
			System.out.println("foreach " + string);
		}

		System.out.println(livros.pop()); // lança exceção caso vazio (java.util.NoSuchElementException)
		System.out.println(livros.poll()); // retorna null caso vazio
		System.out.println(livros.remove()); // lança exceção caso vazio (java.util.NoSuchElementException)
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());

	}
}
