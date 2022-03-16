public class main{
//Neha: I learned about what an interface is and how to return a boolean through lambda notation. I also learned about GitKraken and how to make branches. 
	interface Perfect_Square 
    { 
        boolean boolPerfSquare(int n); 
    } 
    interface Print_Quotient{ 
	    void printQuotient(float num1, float num2); 
    } 
    public static void main(String args[]) {
      Perfect_Square ps = (n1) ->  (n1 > 0 && Math.sqrt((double)n1) % 1 == 0); 
      System.out.println(ps.boolPerfSquare(25)); 
      System.out.println(ps.boolPerfSquare(98)); 
      
      Print_Quotient quotient = (n1, n2) -> System.out.printf("Quotient: %.3f%n", n1/n2); 
	  quotient.printQuotient(40f, 3f); 
    }

}