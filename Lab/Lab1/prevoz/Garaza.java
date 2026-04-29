package prevoz;

import java.io.*;
import java.util.ArrayList;

public class Garaza<T extends Auto> 
{
	private ArrayList<T> automobili;
	
	public Garaza()
	{
		automobili = new ArrayList<>();
	}
	
	public void dodajAuto(T a)
	{
		automobili.add(a);
	}
	
	public void megatest()
	{
		automobili.sort(null);
		try
		{
			FileOutputStream fos = new FileOutputStream("bruteforce.bin");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeDouble(automobili.get(automobili.size()-1).brutalnost());
			dos.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
