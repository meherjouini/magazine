package tn.magazinemanagement.ejb.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_article")
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title;
	@EmbeddedId
	private ArticlePK articlePK;
	
	@OneToMany(mappedBy="article")
	private List<Section> sections;
	
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idMagazinePK", referencedColumnName = "idMagazine", insertable = false, updatable = false)
	private Magazine magazine;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cinRedactorPK", referencedColumnName = "cinRedactor", insertable = false, updatable = false)
	private Redactor redactor;

	public Article() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArticlePK getArticlePK() {
		return articlePK;
	}

	public void setArticlePK(ArticlePK articlePK) {
		this.articlePK = articlePK;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}

	public Redactor getRedactor() {
		return redactor;
	}

	public void setRedactor(Redactor redactor) {
		this.redactor = redactor;
	}

	
}
