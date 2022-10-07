package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores")
public class Ator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@ManyToMany(mappedBy = "atores",cascade = CascadeType.PERSIST)
	private List<Filme> filmes;

	public Ator() {
	}

	public Ator(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Filme> getFilmes() {
		if(filmes == null) {
			filmes = new ArrayList<>();
		}
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		
		this.filmes = filmes;
	}

	public void adicionarFilme(Filme filme) {
		if (filme != null && !getFilmes().contains(filme)) {
			getFilmes().add(filme);
			
			if (filme.getAtores().contains(this)) {
				filme.getAtores().add(this);
			}
		}
	}
}
