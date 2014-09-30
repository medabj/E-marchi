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
	private int IDShoppingCart;
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
