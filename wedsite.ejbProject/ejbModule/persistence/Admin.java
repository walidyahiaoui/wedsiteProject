package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private String immatricule;
	private static final long serialVersionUID = 1L;
	  private List<Owner> owners;

	public Admin() {
		super();
	}   
	public String getImmatricule() {
		return this.immatricule;
	}

	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	
	@OneToMany(mappedBy = "admin")
	public List<Owner> getOwners() {
		return owners;
	}
	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}
	
   
}
