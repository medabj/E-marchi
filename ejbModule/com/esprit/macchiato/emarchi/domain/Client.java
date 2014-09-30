package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	   
	@Id
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
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public int getIDClient() {
		return this.IDClient;
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
   
}
