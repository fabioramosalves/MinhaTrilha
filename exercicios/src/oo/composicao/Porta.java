package oo.composicao;

import java.util.Objects;

public class Porta {
	
	Porta(String codigo){
		
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porta other = (Porta) obj;
		return Objects.equals(codigo, other.codigo);
	}

	String codigo;
	boolean aberta = false;
	
	void abrirPorta() {
		this.aberta = true;
	}
	
	void fecharPorta() {
		this.aberta = true;
	}
}
