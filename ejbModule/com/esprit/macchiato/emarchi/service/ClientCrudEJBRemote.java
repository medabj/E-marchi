package com.esprit.macchiato.emarchi.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.macchiato.emarchi.domain.Admin;
import com.esprit.macchiato.emarchi.domain.Client;

@Remote
public interface ClientCrudEJBRemote {
	public void addPerson(Client p) throws Exception;
	public Client findbyid(long id);
	public void delete(Client p);
	public List<Client> findAllclient();
	

}
