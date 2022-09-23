package streamAPI;

public class MediaTeste {

	public static void main(String[] args) {

		Media m1 = new Media().adicionar(8.3).adicionar(6.7).adicionar(8.7).adicionar(5.5);
		Media m2 = new Media().adicionar(8.0).adicionar(6.0).adicionar(5.7).adicionar(4.5);

		System.out.println(m1.getValor());
		System.out.println(m2.getValor());

		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
