package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Products
 *
 */
@Entity

public class Products implements Serializable {

	   
	@Id
	private int IDProduct;
	private String nameProduct;
	private String Description;
	private float Price;
	private Date depotDate;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Categories categorie;
	
	@OneToMany(mappedBy="product")
	private List<Images> images;
	
	@ManyToMany
	@JoinColumn(nullable=false)
	private List<Client> commenters;
	
	private static final long serialVersionUID = 1L;

	public Products() {
		super();
	}   
	public int getIDProduct() {
		return this.IDProduct;
	}

	public void setIDProduct(int IDProduct) {
		this.IDProduct = IDProduct;
	}   
	public String getNameProduct() {
		return this.nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public float getPrice() {
		return this.Price;
	}

	public void setPrice(float Price) {
		this.Price = Price;
	}   
	public Date getDepotDate() {
		return this.depotDate;
	}

	public void setDepotDate(Date depotDate) {
		this.depotDate = depotDate;
	}
	public Categories getCategorie() {
		return categorie;
	}
	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	public List<Client> getCommenters() {
		return commenters;
	}
	public void setCommenters(List<Client> commenters) {
		this.commenters = commenters;
	}
   
	
}
