package aplicativo;

import dominio.Pessoa;
import dominio.Vendedor;
import dominio.Cliente;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager

        Pessoa pessoa1 = new Pessoa("José",35);
		Vendedor vendedor1 = new Vendedor("Carlos", 50, 01);
		Cliente cliente1 = new Cliente("Gabriel", 20, 01);
		
		
		em.getTransaction().begin();// iniciar transação com banco de dados
		
        em.persist(pessoa1);
		em.persist(vendedor1);
		em.persist(cliente1);
		
		
		
				
		
		Query consultaP = em.createQuery("select pessoa from Professor pessoa"); //consulta em jpql
		ArrayList<Pessoa> listaP = (ArrayList<Pessoa>) consultaP.getResultList();
		
		Query consultaA = em.createQuery("select vendedor from Vendedor vendedor"); //consulta em jpql
		ArrayList<Vendedor> listaA = (ArrayList<Vendedor>) consultaA.getResultList();

        Query consultaC = em.createQuery("select cliente from Cliente cliente"); //consulta em jpql
		ArrayList<Cliente> listaC = (ArrayList<Cliente>) consultaC.getResultList();
		
		em.getTransaction().commit();//confirmar as alterações realizadas
		
		emf.close();
		em.close();
		
		for(Pessoa objP: listaP) {
			System.out.println(objP);
		}
		
		for(Vendedor objA: listaA) {
			System.out.println(objA);
		}
        for(Cliente objC: listaC) {
			System.out.println(objC);
		}
	}			
}