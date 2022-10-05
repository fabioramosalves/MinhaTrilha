package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		// Usuario usuario = new Usuario("Roberto Carlos", "roberto.carlos@gmail.com");
		// Usuario usuario = new Usuario("Antonio Carlos", "antonio.carlos@gmail.com");
		// Usuario usuario = new Usuario("Fabio Ramos Alves", "fabio.r.a.x@gmail.com");
		// Usuario usuario = new Usuario("Ricardo Nunes", "ricardo.nunes@gmail.com");
		Usuario usuario = new Usuario("Leo Pereira", "leo.pereira@gmail.com");

		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();

		System.out.println(usuario.getId());

		emf.close();
		em.close();

	}
}
