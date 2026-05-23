using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJlab3
{
    internal class NemaMesta : Exception
    {
        public NemaMesta(string message) : base(message) { }
    }
}
