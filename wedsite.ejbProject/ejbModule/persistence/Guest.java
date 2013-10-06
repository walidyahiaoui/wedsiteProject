package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Quest
 *
 */
@Entity

public class Guest extends User implements Serializable {

	
	private int number;
	private static final long serialVersionUID = 1L;
	
	private Owner owner;
	

	public Guest() {
		super();
	}   
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@ManyToOne 
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
   
}
