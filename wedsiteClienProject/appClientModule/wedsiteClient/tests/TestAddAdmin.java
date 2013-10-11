package wedsiteClient.tests;

import persistence.Admin;
import wedsiteClient.delegate.UserServiceDelegate;

public class TestAddAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Admin admin=new Admin();
		admin.setIdUser(250);
		admin.setFirstnameUser("admin");
		admin.setLastnameUser("admin");
		admin.setMailUser("admin@admin");
		admin.setImmatricule("12-MT-2013");
		admin.setPasswordUser("admin");
		
		
		UserServiceDelegate.doaddAdmin(admin);

	}

}
