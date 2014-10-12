package com.esprit.macchiato.emarchi.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.security.acl.EntitlementEntry;

import com.esprit.macchiato.emarchi.domain.Categories;

/**
 * Session Bean implementation class CategorieCrudEJB
 */
@Stateless
@LocalBean
public class CategorieCrudEJB implements CategorieCrudEJBRemote, CategorieCrudEJBLocal {
@PersistenceContext(unitName="e-marchiEJB")
private EntityManager em;
    /**
     * Default constructor. 
     */
    public CategorieCrudEJB() {
        
    }

	@Override
	public void addCategorie(Categories p) {
		em.persist(p);
		
	}

	@Override
	public Categories getById(int id) {
		return em.find(Categories.class, id);
		
	}

	@Override
	public void update(Categories p) {
		em.merge(p);
		
	}

	@Override
	public void delete(Categories p) {
		em.remove(em.merge(p));	
		
	}

	@Override
	public void test(Categories p) {
		em.merge(p).setDescription("hamza");
		p.setDescription("Ali");
		
	}
	
	
	
	 

    
  
}
