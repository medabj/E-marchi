package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int IDClient;
	private String firstName;
	private String lastName;
	private Date dateBirth;
	private String eMail;
	private String Address;
	private long tel;
	private String login;
	private String pwd;
	private byte photo;
	private byte genuine;
	private boolean state;

	@OneToOne(mappedBy="client")
	private ShoppingCart cart;
	
	 
	// @ManyToMany()
	//private Set<Products> commentedProd ;
	
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="client")
	private List<ProductReview>Commented;
	
	@OneToMany(mappedBy="client")
	private List<Payment> payments ; 
	
	public Client() {
		super();
	}   
	public int getIDClient() {
		return this.IDClient;
	}

	@Override
	public String toString() {
		return "Client [firstName=" + firstName + "]";
	}
	public void setIDClient(int IDClient) {
		this.IDClient = IDClient;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public Date getDateBirth() {
		return this.dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}   
	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}   
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}   
	public long getTel() {
		return this.tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}   
	public byte getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte photo) {
		this.photo = photo;
	}   
	public byte getGenuine() {
		return this.genuine;
	}

	public void setGenuine(byte genuine) {
		this.genuine = genuine;
	}   
	public boolean getState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public ShoppingCart getCart() {
		return cart;
	}
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public List<ProductReview> getCommentedProd() {
		return Commented;
	}
	public void setCommentedProd(List<ProductReview> commentedProd) {
		this.Commented = commentedProd;
	}
	
	
   
}
