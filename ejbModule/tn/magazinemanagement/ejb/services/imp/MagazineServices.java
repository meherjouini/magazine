package tn.magazinemanagement.ejb.services.imp;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.magazinemanagement.ejb.domain.Article;
import tn.magazinemanagement.ejb.domain.ArticlePK;
import tn.magazinemanagement.ejb.domain.Magazine;
import tn.magazinemanagement.ejb.domain.Redactor;
import tn.magazinemanagement.ejb.services.interfaces.MagazineServicesLocal;
import tn.magazinemanagement.ejb.services.interfaces.MagazineServicesRemote;

/**
 * Session Bean implementation class MagazineServices
 */
@Stateless
public class MagazineServices implements MagazineServicesRemote,
		MagazineServicesLocal {

	@PersistenceContext
	private EntityManager em;

	public MagazineServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createMagazine(Magazine magazine) {

		em.persist(magazine);
		return true;
	}

	@Override
	public boolean createArticle(String nameMagazine, String nameRedactor,
			String lastNameRedactor, String titleArticle,
			Calendar publicationDate) {



		Article article = new Article();
		article.setTitle(titleArticle);

		Magazine magazine = new Magazine();
		magazine.setName(nameMagazine);

		article.setMagazine(magazine);



		Redactor redactor = new Redactor();
		redactor.setFirstName(nameRedactor);
		redactor.setLastName(lastNameRedactor);

		
		ArticlePK articlePK = new ArticlePK();
		articlePK.setCinRedactorPK(redactor.getCinRedactor());
		articlePK.setIdMagazinePK(magazine.getIdMagazine());
		articlePK.setPublicationDate(publicationDate);
		article.setArticlePK(articlePK);		
		article.setRedactor(redactor);

		return true;
	}

	@Override
	public boolean updateArticle(String title, String label) {
		Article article = em.find(Article.class, label);
		article.setTitle(title);
		return false;
	}

	@Override
	public List<Article> findAllArticlesByParams(String cinRedactor,
			String nameRedactor, String lastNameRedactor, String sectionLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createRedactor(Redactor redactor) {
		em.persist(redactor);
		return true;
	}

}
