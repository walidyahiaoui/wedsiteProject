package test.without.delegator;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserServicesRemote;

public class TestUpdateOwner {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserServicesRemote proxy = (UserServicesRemote) context
					.lookup("ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote");
			persistence.Owner owner = (persistence.Owner) proxy
					.findUserById(50);
			owner.setAge(55);
			owner.setFirstnameUser("walid");
			proxy.updateUser(owner);
			System.out.println("le prenom de l'utilisateur a ete modifie a : "
					+ owner.getFirstnameUser());

		}

		catch (NamingException e) {

			e.printStackTrace();
		}
	}

}

