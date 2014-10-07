package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProductReview
 *
 */
@Entity

public class ProductReview implements Serializable {

	   
	@Id
	private long IdProdR;
	private String comment;
	

	private Date date;
	@ManyToOne
	@JoinColumn(nullable=false)
	private Client client;
	@ManyToOne
	@JoinColumn(nullable=false)
	private ProductReview product;
	private static final long serialVersionUID = 1L;

	public ProductReview() {
		super();
	}   
	public long getIdProdR() {
		return this.IdProdR;
	}

	public void setIdProdR(long IdProdR) {
		this.IdProdR = IdProdR;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
