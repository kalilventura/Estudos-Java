package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		// Utilizada para criar uma conex�o com o Banco de dados,
		// O persistenceUnitName saiu do persistence.xml
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("Exercicios-jpa");
		
		// Funciona como um contexto do banco, onde ele cuida das fun��es do banco
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Lulu", "lulu@gmail.com");
		
		entityManager.getTransaction().begin();
		
		// Salva no banco
		// Obs: Os dados ser�o persistidos somente se estivermos em uma transa��o
		entityManager.persist(novoUsuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
