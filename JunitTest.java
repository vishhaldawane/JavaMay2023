import org.junit.jupiter.api.Test;

public class JunitTest {
	public static void main(String[] args) {
		
		Account a  = new Account(50000);
		System.out.println("a "+a);
		a.withdraw(5000);
		System.out.println("a "+a);
	}
}
class Account
{
	float balance;
	
	public Account(float balance) {
		super();
		this.balance = balance;
	}

	void withdraw(float amt) {
		balance = balance - amt;
		balance = balance -1;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
}

//TDD
