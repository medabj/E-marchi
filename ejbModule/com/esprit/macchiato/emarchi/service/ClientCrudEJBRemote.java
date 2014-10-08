package com.esprit.macchiato.emarchi.service;

import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

import com.esprit.macchiato.emarchi.domain.Admin;
import com.esprit.macchiato.emarchi.domain.Client;

@Remote
public interface ClientCrudEJBRemote {
	public void addPerson(Client p) throws Exception;
	public Client findbyid(int id);
	public void delete(int id);
	public Collection<Client> findAllclient();
	

}
