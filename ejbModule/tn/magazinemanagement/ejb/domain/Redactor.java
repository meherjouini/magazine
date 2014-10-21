package tn.magazinemanagement.ejb.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Redactor implements Serializable {

	

	private static final long serialVersionUID = 1L;
	@Id
	private String cinRedactor ;
	private String  firstName;
	private String  lastName;
	
	
	@OneToMany(mappedBy="redactor")
	private List<Article> articles;
	
	
	public Redactor() {
		super();
	}
	
	
	
	public Redactor(String cinRedactor, String firstName, String lastName) {
		super();
		this.cinRedactor = cinRedactor;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public String getCinRedactor() {
		return cinRedactor;
	}
	public void setCinRedactor(String cinRedactor) {
		this.cinRedactor = cinRedactor;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
