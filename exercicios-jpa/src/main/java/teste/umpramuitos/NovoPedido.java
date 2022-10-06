package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<Object>();
		
		Produto produto = new Produto("Caneta", 4.22);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(produto, pedido, 2);
		
		dao.beginTransaction()
			.add(produto)
			.add(pedido)
			.add(item)
			.commitTransaction()
			.close();
		
	}
}
