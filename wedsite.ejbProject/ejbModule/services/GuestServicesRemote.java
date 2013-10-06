package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.Guest;

@Remote
public interface GuestServicesRemote {
	
	public void addGuest(Guest guest);

	public Guest findGuestById(int idGuest);

	public void deleteGuestById(int idGuest);

	public void updateGuest(Guest guest);
	
	public List<Guest> findAllGuests();

}
