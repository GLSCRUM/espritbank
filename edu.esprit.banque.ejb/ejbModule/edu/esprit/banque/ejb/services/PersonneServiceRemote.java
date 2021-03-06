package edu.esprit.banque.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.banque.domain.Admin;
import edu.esprit.banque.domain.Personne;

@Remote
public interface PersonneServiceRemote {
public void addClient(Personne client);
public void updateClient(Personne client);
public Personne findClientByID(int id);
public void deleteClient(Personne client);
public List<Personne> findAllClients();
public List<Personne> getClientByAge(int age);
public Personne getClientByCin(int cin);
public Personne authenticate (String log , String pass);


public double ShowSold(int id);

}
