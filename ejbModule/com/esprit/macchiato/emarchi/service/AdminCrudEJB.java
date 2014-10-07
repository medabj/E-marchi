package com.esprit.macchiato.emarchi.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.macchiato.emarchi.domain.Client;

/**
 * Session Bean implementation class AdminCrudEJB
 */
@Stateless
@LocalBean
public class AdminCrudEJB implements AdminCrudEJBRemote, AdminCrudEJBLocal {
	@PersistenceContext(unitName="e-marchiEJB")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public AdminCrudEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Client findgeall(long id) {
		// TODO Auto-generated method stub
		return em.find(Client.class, id);
	}

	@Override
	public void delete(Client p) {
		// TODO Auto-generated method stub
		
	}

}
