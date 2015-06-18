import java.util.ArrayList;

public class TextPrinter implements Printing
{
	public String drucken(Rechnung r)
	{
		String result ="";
		ArrayList<Artikel> articles = r.getArticleList();
		for(Artikel article : articles)
		{
			//no currency format
			result += article.getBezeichnung()+" "+article.getPreis()+"€\n";
		}
		return result;
	}
}