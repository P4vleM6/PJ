package prevoz;

import java.io.*;

public class SUSAuto extends Auto implements Comparable<Auto>
{
	private Boolean tip;
	
	public SUSAuto()
	{
		super();
		tip = false;
	}
	
	public SUSAuto(int konjaza, int obrtniMoment, Boolean tip)
	{
		super(konjaza, obrtniMoment);
		this.tip = tip;
		try
		{
			FileWriter f = new FileWriter(redniBroj + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			String gorivo;
			if(tip)
				gorivo = "benzin";
			else
				gorivo = "dizel";
			b.write("susauto sa konjazom: " + konjaza + "\nobrtnim momentom: " + obrtniMoment + "\nrednim brojem: " + redniBroj + "\nkoristi: " + gorivo);
			b.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	@Override
	public double brutalnost() 
	{
		if(tip)
			return konjaza * obrtniMoment * 1.5;
		else
			return konjaza * obrtniMoment * 1.3;
	}
	
	@Override
	public int compareTo(Auto o) 
	{
		if(this.brutalnost() < o.brutalnost())
			return -1;
		else if(this.brutalnost() == o.brutalnost())
			return 0;
		else
			return 1;
	}
}
