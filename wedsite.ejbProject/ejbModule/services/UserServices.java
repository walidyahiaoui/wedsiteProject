package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.User;


/**
 * Session Bean implementation class UserServices
 */
@Stateless
@LocalBean
public class UserServices implements UserServicesRemote, UserServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

	@Override
	public User findUserById(int iduser) {
		return entityManager.find(User.class, iduser);
	}

	@Override
	public void deleteUserById(int idUser) {
		entityManager.remove(findUserById(idUser));
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
	}

	@Override
	public List<User> findAllUsers() {
		String jpql = "select u from User u ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}