package wedsiteClient.tests;

import persistence.Owner;
import wedsiteClient.delegate.UserServiceDelegate;

public class TestAddOwner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Owner owner=new Owner();
		owner.setIdUser(50);
		owner.setFirstnameUser("user");
		owner.setLastnameUser("user");
		owner.setMailUser("mail@user");
		owner.setAge(50);
		owner.setSexe("homme");
		owner.setPasswordUser("23967826");
		owner.setAddress("02 rue 62102");
		
		
		UserServiceDelegate.doaddOwner(owner);

	}

}
