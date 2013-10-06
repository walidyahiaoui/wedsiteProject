package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import persistence.Guest;

/**
 * Session Bean implementation class GuestServices
 */
@Stateless
@LocalBean
public class GuestServices implements GuestServicesRemote, GuestServicesLocal {

	private EntityManager entityManager;
    public GuestServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addGuest(Guest guest) {
		entityManager.persist(guest);
		
	}

	@Override
	public Guest findGuestById(int idGuest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGuestById(int idGuest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGuest(Guest guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Guest> findAllGuests() {
		// TODO Auto-generated method stub
		return null;
	}



}
