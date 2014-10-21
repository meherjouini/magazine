package tn.magazinemanagement.ejb.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Section implements Serializable {
	
	
	/**
	 * 
	 */
	
	@Id
	private int idSection;
	private String label;
	
	
	@ManyToOne
	private Article article;
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	public Section() {
		super();
	}
	public Section(int idSection, String label) {
		super();
		this.idSection = idSection;
		this.label = label;
	}
	public int getIdSection() {
		return idSection;
	}
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
