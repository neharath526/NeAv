interface Print_Quotient{
	public void printQuotient(float num1, float num2);
}
public class quotientRunner{
	public static void main (String[]args){
		Print_Quotient quotient = (n1, n2) -> System.out.printf("Quotient: %.3f%n", n1/n2);
		quotient.printQuotient(40f, 3f);
	}
}
