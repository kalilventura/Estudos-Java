package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		// Utilizada para criar uma conexão com o Banco de dados,
		// O persistenceUnitName saiu do persistence.xml
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("Exercicios-jpa");
		
		// Funciona como um contexto do banco, onde ele cuida das funções do banco
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Lulu", "lulu@gmail.com");
		
		entityManager.getTransaction().begin();
		
		// Salva no banco
		// Obs: Os dados serão persistidos somente se estivermos em uma transação
		entityManager.persist(novoUsuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
