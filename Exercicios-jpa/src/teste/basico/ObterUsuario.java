package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Usuario usuario = entityManager.find(Usuario.class, 1L);

		System.out.println(usuario.getNome());
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
