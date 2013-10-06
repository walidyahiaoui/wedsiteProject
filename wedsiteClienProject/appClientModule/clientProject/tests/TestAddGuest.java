package clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Guest;
import services.UserServicesRemote;

public class TestAddGuest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote");

			Guest guest=new Guest();
			guest.setIdUser(200);
			guest.setFirstnameUser("user");
			guest.setLastnameUser("user");
			guest.setMailUser("mail@user");
            guest.setNumber(2);
			guest.setPasswordUser("23967826");
			
			
			
			proxy.addUser(guest);
			
			
		} catch (NamingException e) {
			
			e.printStackTrace();
		}

	}

}
