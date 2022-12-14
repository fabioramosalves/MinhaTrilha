package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Entidade;

//DAO extend Entidade para marcar as entidades que poderão usar a fabrica
public class DAOEntidade<E extends Entidade> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> _class;

	// bloco statico é chamado uma única vez quando a classe for carregada
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// logar o erro -> log4
		}
	}

	public DAOEntidade() {
			this(null);
		}

	public DAOEntidade(Class<E> _class) {
			this._class = _class;
			em = emf.createEntityManager();
		}

	public DAOEntidade<E> beginTransaction() {
		em.getTransaction().begin();
		return this;
	}

	public DAOEntidade<E> commitTransaction() {
		em.getTransaction().commit();
		return this;
	}

	public DAOEntidade<E> add(E entity) {
		em.persist(entity);
		return this;
	}

	public DAOEntidade<E> addAtomic(E entity) {
		this.beginTransaction().add(entity).commitTransaction();
		return this;
	}

	public DAOEntidade<E> remove(E entity) {
		em.remove(entity);
		return this;
	}

	public DAOEntidade<E> update(E entity) {
		em.merge(entity);
		return this;
	}

	public E getById(Object id) {
		return em.find(_class, id);
	}

	public List<E> getAll() {
		return this.getAll(10, 0);
	}

	public List<E> getAll(int limit, int offSet) {

		if (_class == null) {
			throw new UnsupportedOperationException("Classe nula");
		}

		String jpql = "select e from " + _class.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, _class);
		query.setMaxResults(limit);
		query.setFirstResult(offSet);

		List<E> result = query.getResultList();
		return result;
	}

	public void close() {
		em.close();
	}
}