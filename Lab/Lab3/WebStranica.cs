using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJlab3
{
    internal class WebStranica : Stavka
    {
        private string adresa;
        private int godina;

        public string Adresa
        {
            get { return adresa; } 
            set { adresa = value; }
        }
        public int Godina
        {
            get { return godina; }
            set { godina  = value; }
        }

        public WebStranica(string adresa, int godina)
        {
            this.adresa = adresa;
            this.godina = godina;
        }

        public override int GetGodina()
        {
            return godina;
        }

        public override string ToText()
        {
            return $"Web: {adresa}; Godina: {godina}";
        }
    }
}
