package tn.magazinemanagement.ejb.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="t_magazine")
public class Magazine implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int idMagazine;
	private String name;
	private String format;
	
	
	@OneToMany(mappedBy="magazine")
	private List<Article> articles;
	
	
	
	
	
	public Magazine() {
		super();
	}
	public Magazine( String name, String format) {
		super();
		this.name = name;
		this.format = format;
	}
	public int getIdMagazine() {
		return idMagazine;
	}
	public void setIdMagazine(int idMagazine) {
		this.idMagazine = idMagazine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	

}
