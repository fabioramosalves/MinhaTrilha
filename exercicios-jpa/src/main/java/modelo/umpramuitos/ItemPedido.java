package modelo.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modelo.basico.Produto;

@Entity
@Table(name = "items_pedidos")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER) // por padrão o fetch é EAGER
	private Pedido pedido;

	@ManyToOne(fetch = FetchType.EAGER)
	private Produto produto;

	@Column(nullable = false)
	private int quantity;

	@Column(nullable = false)
	private Double price;

	public ItemPedido() {
	};

	public ItemPedido(Produto produto, Pedido pedido, int quantity) {
		this.setProduto(produto);
		this.setPedido(pedido);
		this.setQuantity(quantity);
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;

		if (produto != null && this.price == null)
			this.setPrice(produto.getPreco());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
