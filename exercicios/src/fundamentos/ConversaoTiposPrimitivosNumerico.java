package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {

		double d = 1; // conversão implícita
		System.out.println(d);

		float f = (float) 1.6546546546654; // casting conversão explícita
		System.out.println(f);

		double di = 1.6546546546654654654; // casting conversão explícita
		System.out.println(di);

		int i = 4;
		byte b = (byte) i; // casting conversão explícita
		System.out.println(b);

		int ii = 130;
		byte bb = (byte) ii; // casting conversão explícita
		System.out.println(bb); // -126 cuidado com estas conversões

		double e = 1.99999;
		int ff = (int) e;
		System.out.println(ff); // perderá informação
	}
}
