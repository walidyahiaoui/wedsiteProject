package clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Owner;
import services.UserServicesRemote;

public class TestAddOwner {

	public TestAddOwner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote");

			Owner owner=new Owner();
			owner.setIdUser(45);
			owner.setFirstnameUser("user");
			owner.setLastnameUser("user");
			owner.setMailUser("mail@user");
			owner.setAge(50);
			owner.setSexe("homme");
			owner.setPasswordUser("23967826");
			owner.setAddress("02 rue 62102");
			
			
			proxy.addUser(owner);
			
			
		} catch (NamingException e) {
			
			e.printStackTrace();
		}

	}

}
