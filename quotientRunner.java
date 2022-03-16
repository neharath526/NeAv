interface Print_Quotient{
	public void printQuotient(float num1, float num2);
}
public class quotientRunner{
	public quotientRunner(){
		Print_Quotient quotient = (n1, n2) -> System.out.printf("%.3f%n", n1/n2);
		quotient.printQuotient(40f, 3f);
	}
	//public void printQuotient (float num1, float num2){
		//System.out.printf("%.3f%n", num1/num2);
	//}
	public static void main (String[]args){
		new quotientRunner();
	}
}
