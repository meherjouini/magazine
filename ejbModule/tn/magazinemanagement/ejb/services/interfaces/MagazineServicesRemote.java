package tn.magazinemanagement.ejb.services.interfaces;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;

import tn.magazinemanagement.ejb.domain.Article;
import tn.magazinemanagement.ejb.domain.Magazine;
import tn.magazinemanagement.ejb.domain.Redactor;

@Remote
public interface MagazineServicesRemote {

	public boolean createMagazine(Magazine magazine);

	public boolean createArticle(String nameMagazine, String nameRedactor,
			String lastNameRedactor, String titleArticle,
			Calendar publicationDate);

	public boolean updateArticle(String title, String label);

	public List<Article> findAllArticlesByParams(String cinRedactor,
			String nameRedactor, String lastNameRedactor, String sectionLabel);

	public boolean createRedactor(Redactor redactor);

}
