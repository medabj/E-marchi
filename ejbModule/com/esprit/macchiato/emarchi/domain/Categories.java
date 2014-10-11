package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categories
 *
 */
@Entity

public class Categories implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int IDCategorie;
	private String Description;
	@Lob
	private byte[] Logo;
	
	@OneToMany(mappedBy="categorie")
	private List<Products> products;
	private static final long serialVersionUID = 1L;

	public Categories() {
		super();
	}   
	public int getIDCategorie() {
		return this.IDCategorie;
	}

	public void setIDCategorie(int IDCategorie) {
		this.IDCategorie = IDCategorie;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public byte[] getLogo() {
		return this.Logo;
	}

	public void setLogo(byte[] Logo) {
		this.Logo = Logo;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Categories [IDCategorie=" + IDCategorie + ", Description="
				+ Description + "]";
		//+ ", Logo=" + Arrays.toString(Logo) 
	}
   
	
}
