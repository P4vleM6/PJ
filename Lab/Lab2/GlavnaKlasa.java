package logistika;

public class GlavnaKlasa 
{
	public static void main(String[] args)
	{
		LogistickiCentar c = new LogistickiCentar();
		Posiljka s1 = new StandardniPaket(50, 5, false);
		Posiljka l1 = new LomljiviPaket(70, 8, 2);
		Posiljka s2 = new StandardniPaket(100, 3, true);
		Posiljka l2 = new LomljiviPaket(85, 6, 5);
		
		c.dodajPosiljku(s1);
		c.dodajPosiljku(l1);
		c.dodajPosiljku(s2);
		c.dodajPosiljku(l2);
		
		c.procesuiraj();
	}
}
