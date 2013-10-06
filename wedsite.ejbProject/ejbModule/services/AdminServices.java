package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import persistence.Admin;

/**
 * Session Bean implementation class AdminServices
 */
@Stateless
@LocalBean
public class AdminServices implements AdminServicesRemote, AdminServicesLocal {

	private EntityManager entityManager;
    public AdminServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addAdmin(Admin admin) {
		entityManager.persist(admin);
		
	}

	@Override
	public Admin findAdminById(int idAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdminById(int idAdmin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

}
