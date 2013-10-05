package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	
	private Integer idUser;
	private String passwordUser;
	private String firstnameUser;
	private String lastnameUser;
	private String mailUser;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id    
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public String getFirstnameUser() {
		return firstnameUser;
	}
	public void setFirstnameUser(String firstnameUser) {
		this.firstnameUser = firstnameUser;
	}
	public String getLastnameUser() {
		return lastnameUser;
	}
	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}
	public String getMailUser() {
		return mailUser;
	}
	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}   
	
   
}
