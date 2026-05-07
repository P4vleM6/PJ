package logistika;

public abstract class Posiljka 
{
	protected int tezina;
	protected int danaUMagacinu;
	protected static int redniBroj;
	
	public Posiljka()
	{
		tezina = danaUMagacinu = redniBroj = 0;
	}
	
	public Posiljka(int tezina, int danaUMagacinu)
	{
		this.tezina = tezina;
		this.danaUMagacinu = danaUMagacinu;
		redniBroj++;
	}
	
	public abstract double hitnost();
}
