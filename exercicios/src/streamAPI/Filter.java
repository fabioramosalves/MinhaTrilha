package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import myClass.Util;

public class Filter {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno("Fabio", 7.8));
		alunos.add(new Aluno("Beatriz", 7.4));
		alunos.add(new Aluno("Ana Julia", 5.7));
		alunos.add(new Aluno("Adriana", 8.7));

		alunos.stream().filter(a -> 
				a.nome.equalsIgnoreCase("Fabio"))
				.forEach(a -> System.out.println(a.nome));

		System.out.println("\nNota maior que 7...");
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, String> aluno = 
				a -> "Parabéns " + a.nome + "! Você foi aprovado(a)\n";
		
		alunos.stream()
		.filter(aprovado)
		.map(aluno)
		.forEach(Util.printOutString);

	}
}
