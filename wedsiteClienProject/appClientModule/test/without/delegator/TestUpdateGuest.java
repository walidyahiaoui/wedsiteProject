package test.without.delegator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Guest;
import services.UserServicesRemote;

public class TestUpdateGuest {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote");
	Guest guest=(Guest) proxy.findUserById(10);
	guest.setNumber(50560973);
	guest.setIdUser(300);
	proxy.updateUser(guest);
	System.out.println("le num de tel de l'invité est " +guest.getNumber());
			
			
			
		}
		
catch (NamingException e) {
			
			e.printStackTrace();
		}
	}
}
