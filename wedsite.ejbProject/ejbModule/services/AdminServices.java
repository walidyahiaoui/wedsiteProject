
package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.management.Query;
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
		return entityManager.find(Admin.class, idAdmin);	
		}

	@Override
	public void deleteAdminById(int idAdmin) {
		entityManager.remove(findAdminById(idAdmin));		
	}

	@Override
	public void updateAdmin(Admin admin) {
		entityManager.merge(admin);		
	}

	@Override
	public List<Admin> findAllAdmins() {
		String jpql = "select a from Admin a";
		Query query = (Query) entityManager.createQuery(jpql);
		return  ((javax.persistence.Query) query).getResultList();
	}

}

