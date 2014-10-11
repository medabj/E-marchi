package com.esprit.macchiato.emarchi.service;

import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

import com.esprit.macchiato.emarchi.domain.Products;

@Remote
public interface OffersCRUDRemote {

	public void addOffer(Products p);

	public Products findOfferById(int id);

	public List<Products> findAllOffers();

	public void updateOffer(Products p);

	public void deleteOffer(int id);

}
