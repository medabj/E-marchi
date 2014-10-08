package com.esprit.macchiato.emarchi.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.macchiato.emarchi.domain.Admin;
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
	public void delete( Client p) {
		// TODO Auto-generated method stub
		 em.remove(em.merge(p));	
	}

	


	@Override
	public void addPerson(Client p) throws Exception {
		// TODO Auto-generated method stub
		
		em.persist(p);	
		
		
	}


	


	@Override
	public Client findbyid(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Client> findAllclient() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select s from Client s");
		return query.getResultList();
	}


	
}
