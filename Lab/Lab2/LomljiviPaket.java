package logistika;

import java.io.*;

public class LomljiviPaket extends Posiljka implements Comparable<Posiljka> 
{
	private int nivoZastite;
	
	public LomljiviPaket()
	{
		super();
		nivoZastite = 0;
	}
	
	public LomljiviPaket(int tezina, int danaUMagacinu, int nivoZastite)
	{
		super(tezina, danaUMagacinu);
		this.nivoZastite = nivoZastite;
		try
		{
			FileWriter f = new FileWriter(redniBroj + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write("Tezina " + tezina + "\nDana u magacinu " + danaUMagacinu + "\nNivo zasite ambalaze " + nivoZastite);
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
		return (tezina * danaUMagacinu) + nivoZastite;
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
