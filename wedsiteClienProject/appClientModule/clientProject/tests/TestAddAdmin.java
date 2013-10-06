package clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Admin;
import services.UserServicesRemote;

public class TestAddAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote");

			Admin admin=new Admin();
			admin.setIdUser(4);
			admin.setFirstnameUser("admin");
			admin.setLastnameUser("admin");
			admin.setMailUser("admin@admin");
			admin.setImmatricule("12-MT-2013");
			admin.setPasswordUser("admin");
			
			
			
			proxy.addUser(admin);
			
			
		} catch (NamingException e) {
			
			e.printStackTrace();
		}

	}

}
