package persistence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private String immatricule;
	private static final long serialVersionUID = 1L;
	

	public Admin() {
		super();
	}   
	public String getImmatricule() {
		return this.immatricule;
	}

	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	
	

	
   
}
