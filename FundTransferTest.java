
public class FundTransferTest {
	public static void main(String[] args) {
		SavingsAccount savingsObj1 = new SavingsAccount(101, "Jack", 50000);
		SavingsAccount savingsObj2 = new SavingsAccount(102, "Jane", 30000);
		
		System.out.println("Balance1 : "+savingsObj1.getAccountBalance());
		System.out.println("Balance2 : "+savingsObj2.getAccountBalance());
		
		FundTransferService fundTransferService  = new FundTransferService();
		fundTransferService.transfer(savingsObj1, savingsObj2, 5000);
		
		System.out.println("Balance1 : "+savingsObj1.getAccountBalance());
		System.out.println("Balance2 : "+savingsObj2.getAccountBalance());
		
	}
}

class Account 
{
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	public Account(int accountNumber, String accountName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
	public void withdraw(double amountToWithdraw) {
		System.out.println("Withdrawing...."+amountToWithdraw);
		accountBalance -= amountToWithdraw;
	}
	public void deposit(double amountToDeposit) {
		System.out.println("Depositing...."+amountToDeposit);
		accountBalance += amountToDeposit;
	}
}
interface Withdrawing {
	void withdraw(double amt);
}
interface Depositing {
	void deposit(double amt);
}
class SavingsAccount extends Account implements Withdrawing, Depositing {

	public SavingsAccount(int accountNumber, String accountName, double accountBalance) {
		super(accountNumber, accountName, accountBalance);
		// TODO Auto-generated constructor stub
	}
	
}

class FundTransferService
{
	public void transfer(Withdrawing source, Depositing target, double amountToTransfer) {
		System.out.println("Transfer in progres!!!!");
		source.withdraw(amountToTransfer);
		//source.deposit(amountToTransfer);
		//target.withdraw(amountToTransfer);
		target.deposit(amountToTransfer);
		System.out.println("Funds transferred!!!!");
	}
}
