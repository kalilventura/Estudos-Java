package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Entidade;

public class DAO<E extends Entidade> {
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Class<E> klass;

	// Quando a classe for carregada no Java esse bloco será iniciado
	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		} catch (Exception e) {
			// TODO: create log
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> klass) {
		entityManager = entityManagerFactory.createEntityManager();
		this.klass = klass;
	}

	public DAO<E> openTransaction() {
		entityManager.getTransaction().begin();
		return this;
	}

	public DAO<E> closeTransaction() {
		entityManager.getTransaction().commit();
		return this;
	}

	public void closeDAO() {
		entityManager.close();
	}

	public DAO<E> insert(E entity) {
		entityManager.persist(entity);
		return this;
	}

	public DAO<E> atomicInsert(E entity) {
		return this.openTransaction().insert(entity).closeTransaction();
	}

	public List<E> select(int limit, int offset) {
		if (klass == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}

		String jpql = "select e from " + klass.getName() + " e";

		TypedQuery<E> query = entityManager.createQuery(jpql, klass);
		query.setMaxResults(limit);
		query.setFirstResult(offset);
		return query.getResultList();
	}
}
