public class Artikel
{
	private String artikelBezeichnung;
	private float einzelPreis; //BigDecimal ...

	public Artikel(String bezeichnung, float preis)
	{
		this.artikelBezeichnung = bezeichnung;
		this.einzelPreis = preis;
	}

	public float getPreis()
	{
		return this.einzelPreis;
	}

	public String getBezeichnung()
	{
		return this.artikelBezeichnung;
	}
}