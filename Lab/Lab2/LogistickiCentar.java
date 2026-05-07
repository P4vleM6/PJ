package logistika;

import java.util.ArrayList;
import java.io.*;

public class LogistickiCentar 
{
	private ArrayList<Posiljka> centrala;
	
	public LogistickiCentar()
	{
		centrala = new ArrayList<>();
	}
	
	public void dodajPosiljku(Posiljka p)
	{
		centrala.add(p);
	}
	
	public void procesuiraj()
	{
		centrala.sort(null);
		try
		{
			FileOutputStream fos = new FileOutputStream("prioritet.bin");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeDouble(centrala.get(centrala.size()-1).hitnost());
			dos.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
