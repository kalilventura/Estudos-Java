package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		Usuario usuario = entityManager.find(Usuario.class, 1L);
		
		// O objeto não está mais no estado gerenciado, o que não atualiza automaticamente
		// Só sera persistindo quando chamar o merge
		entityManager.detach(usuario);
		
		usuario.setNome("Leonardo Moura");
		
		// Nesse caso somente ira alterar o usuario chamando a linha abaixo
		entityManager.merge(usuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
