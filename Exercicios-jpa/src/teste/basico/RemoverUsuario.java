package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Usuario usuario = entityManager.find(Usuario.class, 7L);
		
		if(usuario != null) {
			//Sempre que for feito algo que impacte o banco de dados, seja uma alteração
			// inclusão ou exclusao, precisamos estar dentro de uma transaction
			entityManager.getTransaction().begin();
			entityManager.remove(usuario);
			entityManager.getTransaction().commit();
		}
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
