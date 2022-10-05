package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 5L);
		
		em.detach(usuario); //detach remove do estado gerenciado a alteração só será efetivada com o Merge.
		
		usuario.setNome("Leonardo Moura Leitão");
		usuario.setEmail("leonardo.moura@teste.com");
		
		em.merge(usuario);

		em.getTransaction().commit();

		System.out.println(usuario.getEmail() + " " + usuario.getNome());

		emf.close();
		em.close();
	}
}
