package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categories
 *
 */
@Entity

public class Categories implements Serializable {

	   
	@Id
	private int IDCategorie;
	private String Description;
	private byte Logo;
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
	public byte getLogo() {
		return this.Logo;
	}

	public void setLogo(byte Logo) {
		this.Logo = Logo;
	}
   
}
