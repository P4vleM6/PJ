using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJlab3
{
    internal class ClanakCasopisa : Stavka
    {
        private string nazivCasopisa;
        private string naslovClanka;
        private List<string> autori;
        private string mesto;
        private int godina;

        public string NazivCasopisa
        {
            get { return nazivCasopisa; }
            set { nazivCasopisa = value; }
        }
        public string NaslovClanka
        {
            get { return naslovClanka; }
            set { naslovClanka = value; }
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

        public ClanakCasopisa(string nazivCasopisa, string naslovClanka, List<string> autori, string mesto, int godina)
        {
            this.nazivCasopisa = nazivCasopisa;
            this.naslovClanka = naslovClanka;
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
            return $"Casopis: \"{nazivCasopisa}\", Članak: \"{naslovClanka}\", Autori: {auth}, Mesto: {mesto}, Godina: {godina}";
        }
    }
}
