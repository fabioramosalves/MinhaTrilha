package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAsssento2 {
	public static void main(String[] args) {

		Assento assento = new Assento("4DFR");
		Cliente cliente = new Cliente("Rodrigo Noris", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.addAtomic(cliente).close();
	}
}
