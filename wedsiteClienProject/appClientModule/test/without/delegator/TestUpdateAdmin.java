package test.without.delegator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Admin;
import services.UserServicesRemote;

public class TestUpdateAdmin {
	
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote");
	Admin admin=(Admin) proxy.findUserById(18);
	admin.setImmatricule("bsr gogo");
	proxy.updateUser(admin);
	
	System.out.println("le num de matricule de l'admin est " +admin.getImmatricule());
			
			
			
		}
		
catch (NamingException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

}
