using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

interface Perfect_Square
{
    Boolean PrintPerfectMethod(int n1);
}
class PSquare : Perfect_Square
{
    public Boolean PrintPerfectMethod(int n1)
    {
        return n1 > 0 && Math.Sqrt((double)n1) % 1 == 0;
    }
}
class Program
{
    static void Main(string[] args)
    {
        PSquare sq = new PSquare();
        Console.WriteLine(sq.PrintPerfectMethod(25));
        Console.WriteLine(sq.PrintPerfectMethod(27));
        Console.WriteLine(sq.PrintPerfectMethod(-25));
    }
}
