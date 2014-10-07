package com.esprit.macchiato.emarchi.service;

import javax.ejb.Remote;

import com.esprit.macchiato.emarchi.domain.Client;

@Remote
public interface AdminCrudEJBRemote {
	public Client findbyid(long id);
	public void delete(Client p);

}
