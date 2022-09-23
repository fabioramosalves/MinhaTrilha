package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.71);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();

		// allMatch (todos combinaram)
		System.out.println("\nTodos aprovados? " 
				+ alunos.stream().allMatch(aprovado));

		// anyMatch (algum combinou)
		System.out.println("\nAlgum aprovado? " 
				+ alunos.stream().anyMatch(aprovado));

		// noneMatch (nenhum combinou)
		System.out.println("\nNenhum aprovado? " 
				+ alunos.stream().noneMatch(reprovado));
	}
}
