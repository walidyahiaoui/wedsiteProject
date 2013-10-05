package clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.User;
import services.UserServicesRemote;

public class TestAddUser {

	public TestAddUser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:app/wedsiteProject/OwnerServices!services.OwnerServicesRemote");

			User user=new User();
			user.setIdUser(1);
			user.setFirstnameUser("user1");
			user.setLastnameUser("user");
			user.setMailUser("mail@user");
		
			
			proxy.addUser(user);
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
