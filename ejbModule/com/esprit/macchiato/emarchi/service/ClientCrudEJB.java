package com.esprit.macchiato.emarchi.service;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.macchiato.emarchi.domain.Client;

/**
 * Session Bean implementation class AdminCrudEJB
 */
@Stateless
@LocalBean
public class ClientCrudEJB implements ClientCrudEJBRemote, ClientCrudEJBLocal {
	@PersistenceContext(unitName="e-marchiEJB")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public ClientCrudEJB() {
        // TODO Auto-generated constructor stub
    }

	
	

	@Override
	public void addPerson(Client p) throws Exception {
		// TODO Auto-generated method stub
		
		em.persist(p);	
		
		
	}


	


	@Override
	public Client findbyid(int id) {
		// TODO Auto-generated method stub
		return em.find(Client.class, id);
	}


	@SuppressWarnings("unchecked")
	@Override
	public Collection<Client> findAllclient() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select s from Client s");
		return query.getResultList();
	}




	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		em.remove(em.find(Client.class,id));	
	}


	



	




	


	
}
