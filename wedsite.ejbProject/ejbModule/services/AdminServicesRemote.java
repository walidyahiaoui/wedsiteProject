package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.Admin;

@Remote
public interface AdminServicesRemote {
	
	public void addAdmin(Admin admin);

	public Admin findAdminById(int idAdmin);

	public void deleteAdminById(int idAdmin);

	public void updateAdmin(Admin admin);
	
	public List<Admin> findAllAdmins();

}
