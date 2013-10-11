package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import persistence.Owner;
import persistence.User;

/**
 * Session Bean implementation class OwnerServices
 */
@Stateless
@LocalBean
public class OwnerServices extends User implements OwnerServicesRemote, OwnerServicesLocal {
       
	private EntityManager entityManager;
    public OwnerServices() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addOwner(Owner owner) {
		entityManager.persist(owner);
		
	}

	@Override
	public Owner findOwnerById(int idOwner) {
		return entityManager.find(Owner.class, idOwner);
	}

	@Override
	public void deleteOwnerById(int idOwner) {
	
		

		entityManager.remove(findOwnerById(idOwner));
	}

	@Override
	public void updateOwner(Owner owner) {
		entityManager.merge(owner);		
	}

	@Override
	public List<Owner> findAllOwners() {
		return entityManager.createQuery("select o from Owner o ")
				.getResultList();
	}

}
