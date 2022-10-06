package teste.umpraum;

import infra.DAO;
import modelo.basico.Entidade;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		DAO<Object> clienteDAO = new DAO<>();
		
		Assento assento = new Assento("ABF4");
		Cliente cliente = new Cliente("Fabio",assento );
		
		clienteDAO.addAtomic(assento);
		clienteDAO.addAtomic(cliente).close();
		
		System.out.print(cliente);
	}
}
