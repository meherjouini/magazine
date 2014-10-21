package tn.magazinemanagement.ejb.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class ArticlePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cinRedactorPK;
	private int idMagazinePK;
	private Calendar publicationDate;

	public ArticlePK() {
		super();
	}

	
	
	
	public ArticlePK(String cinRedactorPK, int idMagazinePK,
			Calendar publicationDate) {
		super();
		this.cinRedactorPK = cinRedactorPK;
		this.idMagazinePK = idMagazinePK;
		this.publicationDate = publicationDate;
	}




	public String getCinRedactorPK() {
		return cinRedactorPK;
	}




	public void setCinRedactorPK(String cinRedactorPK) {
		this.cinRedactorPK = cinRedactorPK;
	}




	public int getIdMagazinePK() {
		return idMagazinePK;
	}




	public void setIdMagazinePK(int idMagazinePK) {
		this.idMagazinePK = idMagazinePK;
	}




	public Calendar getPublicationDate() {
		return publicationDate;
	}




	public void setPublicationDate(Calendar publicationDate) {
		this.publicationDate = publicationDate;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cinRedactorPK == null) ? 0 : cinRedactorPK.hashCode());
		result = prime * result + idMagazinePK;
		result = prime * result
				+ ((publicationDate == null) ? 0 : publicationDate.hashCode());
		return result;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticlePK other = (ArticlePK) obj;
		if (cinRedactorPK == null) {
			if (other.cinRedactorPK != null)
				return false;
		} else if (!cinRedactorPK.equals(other.cinRedactorPK))
			return false;
		if (idMagazinePK != other.idMagazinePK)
			return false;
		if (publicationDate == null) {
			if (other.publicationDate != null)
				return false;
		} else if (!publicationDate.equals(other.publicationDate))
			return false;
		return true;
	}
	
	

}
