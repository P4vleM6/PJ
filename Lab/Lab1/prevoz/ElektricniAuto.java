package prevoz;

import java.io.*;

public class ElektricniAuto extends Auto implements Comparable<Auto>
{
	private int kapacitetBaterije;
	
	public ElektricniAuto()
	{
		super();
		kapacitetBaterije = 0;
	}
	
	public ElektricniAuto(int konjaza, int obrtniMoment, int kapacitetBaterije)
	{
		super(konjaza, obrtniMoment);
		this.kapacitetBaterije = kapacitetBaterije;
		try
		{
			FileWriter f = new FileWriter(redniBroj + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write("elektricni auto sa konjazom: " + konjaza + "\nobrtnim momentom: " + obrtniMoment + "\nrednim brojem: " + redniBroj + "\nkapacitetom baterije: " + kapacitetBaterije);
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
		return konjaza * obrtniMoment + kapacitetBaterije;
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
