package wedsiteClient.delegate;

import persistence.Admin;
import persistence.Guest;
import persistence.Owner;
import services.UserServicesRemote;
import wedsiteClient.locator.ServiceLocator;

public class UserServiceDelegate{

	private static final String jndiName = "ejb:/wedsite.ejbProject/UserServices!services.UserServicesRemote";
	
	private static UserServicesRemote getProxy(){
		return (UserServicesRemote)ServiceLocator
				.getInstance().
				 	getProxy(jndiName);
	}
	
	public static void doaddOwner(Owner owner) {
		getProxy().addUser(owner);
		
	}
	
	public static void doaddGuest(Guest guest) {
		getProxy().addUser(guest);
		
	}
	
	
	public static void doaddAdmin(Admin admin) {
		getProxy().addUser(admin);
		
	}




}
