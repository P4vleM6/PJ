package glavniPaket;
import prevoz.*;

public class GlavnaKlasa 
{
	public static void main(String[] args)
	{
		Garaza<Auto> g = new Garaza<>();
		Auto sus1 = new SUSAuto(200, 400, true);
		Auto el1 = new ElektricniAuto(250, 450, 1900);
		Auto sus2 = new SUSAuto(150, 250, false);
		Auto el2 = new ElektricniAuto(300, 500, 2500);
		g.dodajAuto(sus1);
		g.dodajAuto(el1);
		g.dodajAuto(sus2);
		g.dodajAuto(el2);
		g.megatest();
	}
}
