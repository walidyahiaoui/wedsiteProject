package wedsiteClient.tests;

import persistence.Guest;
import wedsiteClient.delegate.UserServiceDelegate;

public class TestAddGuest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Guest guest=new Guest();
		guest.setIdUser(10);
		guest.setFirstnameUser("guestuser");
		guest.setLastnameUser("guestuser");
		guest.setMailUser("mail@user");
        guest.setNumber(2);
		guest.setPasswordUser("23967826");
		
		
		UserServiceDelegate.doaddGuest(guest);

	}

}
