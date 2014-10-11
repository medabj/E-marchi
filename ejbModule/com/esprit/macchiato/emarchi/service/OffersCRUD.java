package com.esprit.macchiato.emarchi.service;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.macchiato.emarchi.domain.Products;

/**
 * Session Bean implementation class OffersCRUD
 */
@Stateless
public class OffersCRUD implements OffersCRUDRemote, OffersCRUDLocal {

	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public OffersCRUD() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addOffer(Products p) {
		em.persist(p);
		
	}

	@Override
	public Products findOfferById(int id) {
		return em.find(Products.class, id);
	}

	@Override
	public Collection<Products> findAllOffers() {
		Query query=em.createQuery("select p from Products p");
		return query.getResultList();
	}

	@Override
	public void updateOffer(Products p) {
		em.merge(p);
		
	}

	@Override
	public void deleteOffer(int id) {
		Products p = findOfferById(id);
		em.remove(em.merge(p));
		
	}

}
