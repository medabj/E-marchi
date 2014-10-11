package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ShoppingCart
 *
 */
@Entity

public class ShoppingCart implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int IDShoppingCart;
	

	@OneToOne
	@JoinColumn(nullable=false)
	private Client client;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	private static final long serialVersionUID = 1L;

	public ShoppingCart() {
		super();
	}   
	public int getIDShoppingCart() {
		return this.IDShoppingCart;
	}

	public void setIDShoppingCart(int IDShoppingCart) {
		this.IDShoppingCart = IDShoppingCart;
	}
   
}
