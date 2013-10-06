package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.User;



@Remote
public interface UserServicesRemote {

	public void addUser(User user);

	public User findUserById(int idUser);

	public void deleteUserById(int idUser);

	public void updateUser(User user);

	public List<User> findAllUsers();

}