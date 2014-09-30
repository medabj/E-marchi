package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.lang.Byte;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin implements Serializable {

	   
	@Id
	private int IDAdmin;
	private String login;
	private String pwd;
	private Byte photo;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public int getIDAdmin() {
		return this.IDAdmin;
	}

	public void setIDAdmin(int IDAdmin) {
		this.IDAdmin = IDAdmin;
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
	public Byte getPhoto() {
		return this.photo;
	}

	public void setPhoto(Byte photo) {
		this.photo = photo;
	}
   
}
