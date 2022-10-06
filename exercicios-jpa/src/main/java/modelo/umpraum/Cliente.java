package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import modelo.basico.Entidade;

@Entity
@Table(name = "clientes")
public class Cliente implements Entidade{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "assento_id", unique = true)
	private Assento assento;
	
	public Cliente() {}
	
	public Cliente(String nome, Assento assento) {
		this.nome = nome;
		this.assento = assento;
	}

	
	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return String.format("Cliente: %s Assento: %s", this.getNome(), this.getAssento().getNome());
	}
}
