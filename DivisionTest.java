
public class DivisionTest {
	public static void main(String[] args) {
		System.out.println("MAIN started...");
				MyCalculator myCalci = new MyCalculator();
				myCalci.divide(100, 5);
				myCalci.divide(100, 0);
				myCalci.divide(100, 35);
		System.out.println("MAIN finished...");
	}
}

class MyCalculator
{
	void divide(int num, int deno) {
		System.out.println("\n\tDIVIDE started...");
		System.out.println("\tTrying to divide "+num+" by "+deno);
		//try {
			int div  = num / deno; //JVM is throwing an exception object and terminating our application
		//	System.out.println("\tDivision : "+div);
		//}
		//catch(ArithmeticException e) {
		//	System.out.println("some problem in divide : "+e);
		//}
		
					/*
					 * ArithmeticException e = new ArithmeticException("/ by Zero");
					 * throw e;
					 */
		
		System.out.println("\tDIVIDE finished...\n");
	}
}
