package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		String jpql = "select u from Usuario u";

		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

		System.out.println("----------query.setMaxResults(5).forEach encadeado--------------------------");
		query.setMaxResults(5).getResultList()
				.forEach(u -> System.out.printf("Id: %s Nome: %s Email: %s \n", u.getId(), u.getNome(), u.getEmail()));

		System.out.println("--------------for-----------------------");
		List<Usuario> usuario = query.getResultList();

		for (Usuario u : usuario) {
			System.out.printf("Id: %s Nome: %s Email: %s \n", u.getId(), u.getNome(), u.getEmail());
		}
		
		System.out.println("----------------forEach---------------------");
		usuario.forEach(u -> System.out.printf("Id: %s Nome: %s Email: %s \n", u.getId(), u.getNome(), u.getEmail()));

		emf.close();
		em.close();
	}
}
