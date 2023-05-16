public class AccountTest {
	public static void main(String[] args) {

		Account accObj1 = new Account();
		accObj1.setAccount(123, "Sachin", 50000);
		
		Account accObj2 = new Account();
		accObj2.setAccount(223, "Dhoni", 60000);
		
		accObj1.showAccount();
		accObj2.showAccount();
		
		accObj1.withdraw(1500);
		accObj2.deposit(2500);
		
		accObj1.showAccount();
		accObj2.showAccount();	
		
	}
}

class Account {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	void setAccount(int x, String y, double z)
	{
		accountNumber=x;
		accountHolderName=y;
		accountBalance=z;
	}
	void showAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("----------------------");
	}
	double withdraw(double amountToWithdraw) {
		System.out.println(accountHolderName+" is withdrawing..."+amountToWithdraw);
		accountBalance  = accountBalance - amountToWithdraw;
		return accountBalance;
	}
	double deposit(double amountToDeposit) {
		System.out.println(accountHolderName+" is Depositing..."+amountToDeposit);
		accountBalance  = accountBalance + amountToDeposit;
		return accountBalance;
	}
}
