package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Busca todos os registros na tabela
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = entityManager.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);

		List<Usuario> usuarios = query.getResultList();

		// Podemos fazer encadeando os metodos
//		List<Usuario> usuarios = entityManager
//											.createQuery(jpql, Usuario.class)
//											.setMaxResults(5)
//											.getResultList();

		for (Usuario usuario : usuarios) {
			String message = String.format("Id: %d, Nome: %s, Email: %s", usuario.getId(), usuario.getNome(), usuario.getEmail());
			System.out.println(message);
		}

		entityManager.close();
		entityManagerFactory.close();
	}

}
