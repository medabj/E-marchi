package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Images
 *
 */
@Entity

public class Images implements Serializable {

	   
	@Id
	private int IDImage;
	private byte image;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Products product;
	public Images() {
		super();
	}   
	public int getIDImage() {
		return this.IDImage;
	}

	public void setIDImage(int IDImage) {
		this.IDImage = IDImage;
	}   
	public byte getImage() {
		return this.image;
	}

	public void setImage(byte image) {
		this.image = image;
	}
   
}
