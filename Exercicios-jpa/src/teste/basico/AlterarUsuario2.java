package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		
		/**
		 * Esse comportamento acontece pois o objeto está em um contexto gerenciado
		 * Mesmo não chamando o merge a entidade foi alterada no banco de dados
		 * Quando alteramos um objeto em um contexto de transação mesmo sem chamar o merge
		 * o JPA vai atualizar no banco mesmo não chamando o merge
		 */
		entityManager.getTransaction().begin();
		
		Usuario usuario = entityManager.find(Usuario.class, 1L);
		usuario.setNome("Leonardo Alterado");
		
		//entityManager.merge(usuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
