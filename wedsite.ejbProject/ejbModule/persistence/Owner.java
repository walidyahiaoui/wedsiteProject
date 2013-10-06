package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Owner
 *
 */
@Entity
public class Owner extends User implements Serializable {

	
	private String sexe;
	private int age;
	private String address;
	private static final long serialVersionUID = 1L;
    private List<Guest> guests;
    private Admin admin;

	public Owner() {
		super();
	}   
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToMany(mappedBy = "owner")
	public List<Guest> getGuests() {
		return guests;
	}
	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}
	public Owner(String sexe, int age, String address) {
		super();
		this.sexe = sexe;
		this.age = age;
		this.address = address;
	}
	
	@ManyToOne 
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
   
}
