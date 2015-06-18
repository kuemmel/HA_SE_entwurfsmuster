import java.util.ArrayList;

public class Rechnung
{
	private ArrayList<Artikel> artikel = new ArrayList<>();
	private Printing printer;

	public void add(Artikel artikel)
	{
		artikel.add(artikel)
	}

	public String drucken()
	{
		return printer.drucken();
	}

	setPrinter(Printing printer)
	{
		this.printer = printer;
	}
}