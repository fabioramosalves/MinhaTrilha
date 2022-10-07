package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrino {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();

		Tio tio1 = new Tio("TIO-1");
		Tio tio2 = new Tio("TIO-2");

		Sobrinho sobrinho1 = new Sobrinho("SOBRINHO-1");
		Sobrinho sobrinho2 = new Sobrinho("SOBRINHO-2");

		tio1.getSobrinos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);

		tio1.getSobrinos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);

		tio2.getSobrinos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);

		tio2.getSobrinos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);

		dao.beginTransaction()
			.add(tio1)
			.add(tio2)
			.add(sobrinho1)
			.add(sobrinho2)
			.commitTransaction()
			.close();
	}
}
