package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

	@ManyToMany
	private List<Sobrinho> sobrinos = new ArrayList<>();
	
	public Tio() {}
	
	public Tio(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public List<Sobrinho> getSobrinos() {
		return sobrinos;
	}

	public void setSobrinos(List<Sobrinho> sobrinos) {
		this.sobrinos = sobrinos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
