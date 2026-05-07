package logistika;

import java.io.*;

public class StandardniPaket extends Posiljka implements Comparable<Posiljka> 
{
	private boolean nacin; // false za kopneni, true za vodeni
	
	public StandardniPaket()
	{
		super();
		nacin = false;
	}
	
	public StandardniPaket(int tezina, int danaUMagacinu, boolean nacin)
	{
		super(tezina, danaUMagacinu);
		this.nacin = nacin;
		try
		{
			FileWriter f = new FileWriter(redniBroj + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			String nacinprevoza;
			if (nacin = false)
				nacinprevoza = "Kopneno";
			else
				nacinprevoza = "Vodeno";
			b.write("Paket tezine " + tezina + "\nDana u magacinu " + danaUMagacinu + "\nPrevezen " + nacinprevoza);
			b.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	
	@Override
	public double hitnost() 
	{
		if (this.nacin = false)
			return (tezina * danaUMagacinu * 1.2);
		else
			return (tezina * danaUMagacinu * 1.1);
	}

	@Override
	public int compareTo(Posiljka o) 
	{
		if (this.hitnost() < o.hitnost())
			return -1;
		else if (this.hitnost() == o.hitnost())
			return 0;
		else
			return 1;
	}
}
