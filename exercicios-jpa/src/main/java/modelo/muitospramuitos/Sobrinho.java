package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinos")
	private List<Tio> tios = new ArrayList<>();
	
	public Sobrinho() {}
	
	public Sobrinho(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setId(String nome) {
		this.nome = nome;
	}

	public List<Tio> getTios() {
		return tios;
	}

	public void setTios(List<Tio> tios) {
		this.tios = tios;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
