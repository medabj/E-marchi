package com.esprit.macchiato.emarchi.service;

import javax.ejb.Remote;

import com.esprit.macchiato.emarchi.domain.Categories;

@Remote
public interface CategorieCrudEJBRemote {
	 
		
	   
	  public void addCategorie(Categories p) ;
		
	  public Categories getById(int id); 
		
		public void update(Categories p) ;
		
		public void delete(Categories p) ;
		
		public void test(Categories p); 

}
