using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJlab3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Literatura lit = new Literatura();

                lit.Dodaj(new Knjiga("Uvod u C#", new List<string> { "Petar Petrov", "Jovana Jovanovic" }, "Beograd", 2015));
                lit.Dodaj(new ClanakCasopisa("Programerski Casopis", "Napredne teme u C#", new List<string> { "Marko Markovic" }, "Novi Sad", 2018));
                lit.Dodaj(new WebStranica("https://example.com/tutorial", 2020));
                lit.Dodaj(new Knjiga("Algoritmi i strukture podataka", new List<string> { "Ana Anic" }, "Nis", 2012));

                Console.WriteLine("Pre sortiranja:");
                lit.IspisiSve();


                lit.SortirajPoTekstu(true);
                Console.WriteLine("\nPosle sortiranja po tekstu (rastuce):");
                lit.IspisiSve();


                string putanja = "literatura.txt";
                lit.UpisiUFajl(putanja);
                Console.WriteLine($"\nLiteratura sacuvana u fajl: {putanja}");

                Literatura nova = new Literatura();
                Console.WriteLine("\nSadrzaj ucitan iz fajla:");
                nova.ProcitajIzFajla(putanja);

            }
            catch (NemaMesta ex)
            {
                Console.WriteLine("Greska: " + ex.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Neocekivana greska: " + ex.Message);
            }
        }
    }
}
