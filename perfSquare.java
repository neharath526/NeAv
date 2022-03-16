import java.lang.Math;

public class perfSquare{
    interface Perfect_Square
    {
        boolean boolPerfSquare(int n);
    }
    public static void main(String[]args){
      Perfect_Square ps = (n1) ->  (n1 > 0 && Math.sqrt((double)n1) % 1 == 0);
      System.out.println(ps.boolPerfSquare(25));
      System.out.println(ps.boolPerfSquare(98));
     }
}