using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJlab3
{
    internal class Knjiga : Stavka
    {
        private string naslov;
        private List<string> autori;
        private string mesto;
        private int godina;

        public string Naslov
        {
            get { return naslov; }
            set { naslov = value; }
        }
        public List<string> Autori
        {
            get { return autori; }
            set { autori = value; }
        }
        public string Mesto
        {
            get { return mesto; }
            set { mesto = value; }
        }
        public int Godina
        {
            get { return godina; }
            set { godina = value; }
        }

        public Knjiga(string naslov, List<string> autori, string mesto, int godina)
        {
            this.naslov = naslov;
            this.autori = new List<string>(autori);
            this.mesto = mesto;
            this.godina = godina;
        }

        public override int GetGodina()
        {
            return godina;
        }

        public override string ToText()
        {
            string auth = string.Join(", ", autori);
            return $"Knjiga: \"{naslov}\", Autori: {auth}, Mesto: {mesto}, Godina: {godina}";
        }
    }
}
