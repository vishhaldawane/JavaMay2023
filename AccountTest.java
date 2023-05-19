import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest
{
	@Test
	public void testA() {
		System.out.println("line1");
		System.out.println("line2");
	Assertions.assertTrue(10>5);
		System.out.println("line3");
		System.out.println("line4");
	Assertions.assertTrue(10>50);
		System.out.println("line5");
		
	}
	
	@Test
	public void testB() {
	
		float currentBalance=50000;
		float amountToWithdraw=5000;
		Account a = new Account(currentBalance);
		System.out.println("Searching for a");
	Assertions.assertTrue(a!=null);
		System.out.println("A is there");
		a.withdraw(amountToWithdraw);
	Assertions.assertEquals(currentBalance-amountToWithdraw, a.balance);
		System.out.println("test is passed...");
		
	}
		
}
