
public class AbstractTest {
	public static void main(String[] args) {
		//Account acc1 = new Account(101,"Jack",5000);
		Account acc2 = new SavingsAccount(102,"Jane",5000,6.7f);
		
	}
}
abstract class Account //incomplete
{
	private int acno;
	private String acname;
	private double balance;
	
	public Account(int acno, String acname, double balance) {
		super();
		this.acno = acno;
		this.acname = acname;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", acname=" + acname + ", balance=" + balance + "]";
	}
	abstract void withdraw(double amt);
	abstract void deposit(double amt);
	
}
class SavingsAccount extends Account
{
	private float rate;

	public SavingsAccount(int acno, String acname, double balance, float rate) {
		super(acno, acname, balance);
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [toString()=" + super.toString() + ", rate=" + rate + "]";
	}

	@Override
	void withdraw(double amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deposit(double amt) {
		// TODO Auto-generated method stub
		
	}
	
	
}





abstract class Manager
{
	abstract void doThis(); //must reside in an abstract class
	
}
class FollowingTheManager extends Manager
{
	void doThis() {
		
	}
}

