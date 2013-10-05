package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.Owner;



@Remote
public interface OwnerServicesRemote {
	
	public void addOwner(Owner owner);

	public Owner findOwnerById(int idOwner);

	public void deleteOwnerById(int idOwner);

	public void updateOwner(Owner owner);
	
	public List<Owner> findAllOwners();


}
