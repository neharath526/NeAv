public class main{

	interface Perfect_Square
    {
        boolean boolPerfSquare(int n);
    }
    //Avni - learned how to properly use an interface in the runner
    interface Print_Quotient{
	    void printQuotient(float num1, float num2);
    }
    public static void main(String args[]) {
      Perfect_Square ps = (n1) ->  (n1 > 0 && Math.sqrt((double)n1) % 1 == 0);
      System.out.println(ps.boolPerfSquare(25));
      System.out.println(ps.boolPerfSquare(98));
      //Avni - learned the function of a lambda notation
      //Avni - learned how to use System.out.printf to make output come out in a neat and organized format
      Print_Quotient quotient = (n1, n2) -> System.out.printf("Quotient: %.3f%n", n1/n2);
	  quotient.printQuotient(40f, 3f);
    }

}