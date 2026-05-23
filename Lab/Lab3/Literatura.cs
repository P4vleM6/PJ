using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJlab3
{
    internal class Literatura
    {
        private List<Stavka> stavke;
        public const int maxStavke = 10;
        public Literatura()
        {
            stavke = new List<Stavka>();
        }

        public void Dodaj(Stavka s)
        {
            if (stavke.Count >= maxStavke)
            {
                throw new NemaMesta($"Nema mesta za novu stavku. Maksimalno: {maxStavke}");
            }
            stavke.Add(s);
        }

        public void SortirajPoGodini(bool rastuce)
        {
            if (rastuce)
                stavke = stavke.OrderBy(s => s.GetGodina()).ToList();
            else
                stavke = stavke.OrderByDescending(s => s.GetGodina()).ToList();
        }

        public void SortirajPoTekstu(bool rastuce)
        {
            if (rastuce)
                stavke = stavke.OrderBy(s => s.ToText(), StringComparer.CurrentCultureIgnoreCase).ToList();
            else
                stavke = stavke.OrderByDescending(s => s.ToText(), StringComparer.CurrentCultureIgnoreCase).ToList();
        }

        public void IspisiSve()
        {
            if (stavke.Count == 0)
            {
                Console.WriteLine("Literatura je prazna.");
                return;
            }
            for (int i = 0; i < stavke.Count; i++)
            {
                Console.WriteLine($"{i + 1}. {stavke[i].ToText()}");
            }
        }

        public void UpisiUFajl(string fajl)
        {
            using (StreamWriter sw = new StreamWriter(fajl))
            {
                foreach (var stavka in stavke)
                {
                    sw.WriteLine(stavka.ToText());
                }
            }
        }

        public void ProcitajIzFajla(string fajl)
        {
            if (!File.Exists(fajl))
            {
                Console.WriteLine("Fajl ne postoji.");
                return;
            }

            using (StreamReader sr = new StreamReader(fajl))
            {
                string linija;
                while ((linija = sr.ReadLine()) != null)
                {
                    Console.WriteLine(linija);
                }
            }
        }
    }
}
