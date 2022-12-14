package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia.

		fila.add("Ana");// retorna false
		fila.offer("Bia");// Lança exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// O Peek e o Element -> obter o proximo elemento da fila sem remover
		// Diferença é o comportamento quando a fila está vazia.

		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lança exceção
		System.out.println(fila.element());

	
		//Poll e Remove -> obtem o proximo elemento da fila e remove
		
		System.out.println(fila.poll());// retorna o elemento remove
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna false
		
		System.out.println(fila.remove());// lança exeção java.util.NoSuchElementException
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
	}
}
