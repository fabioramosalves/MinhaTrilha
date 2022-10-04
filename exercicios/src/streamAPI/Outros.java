package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Luna", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		// para funcionar o distinct deve ser implementada a função
		// equals e hashCode na classe Aluno
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSkip...");
		alunos.stream().skip(5).forEach(System.out::println);
		System.out.println("\nLimit...");
		alunos.stream().limit(2).forEach(System.out::println);

		System.out.println("\ntakeWhile...");
		alunos.stream().takeWhile(c -> c.nota >= 7).forEach(System.out::println);

	}
}
