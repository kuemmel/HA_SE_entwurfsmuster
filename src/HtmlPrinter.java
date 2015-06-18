import java.util.ArrayList;

public class HtmlPrinter implements Printing
{
	public String drucken(Rechnung r)
	{
		String result = "<table>";
		ArrayList<Artikel> articles = r.getArticleList();
		for(Artikel article : articles)
		{
			//no currency format
			result += "<tr><td>"+article.getBezeichnung()+"</td><td> "+article.getPreis()+"€</td></tr> \n";
		}
		result += "</table>\n";
		return result;
	}
}