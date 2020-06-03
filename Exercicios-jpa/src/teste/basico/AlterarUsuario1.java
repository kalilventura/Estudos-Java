package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		Usuario usuario = entityManager.find(Usuario.class, 1L);
		usuario.setNome("Leonardo");
		usuario.setEmail("leonardo@gmail.com");
		
		// Faz a atualização do registro na tabela
		entityManager.merge(usuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
