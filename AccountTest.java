public class AccountTest {
	public static void main(String[] args) {

		Account accObj1 = new Account(123, "Sachin", 50000);
		
		Account accObj2 = new Account(223, "Dhoni", 60000);
		
		accObj1.showAccount();
		accObj2.showAccount();
		
		double remainingBalance1 = accObj1.withdraw(1500);
		System.out.println("Remaining balance  :" +remainingBalance1);
		
		double remainingBalance2 = accObj2.deposit(2500);
		System.out.println("Remaining balance  :" +remainingBalance2);
		
		accObj1.showAccount();
		accObj2.showAccount();	
		
		//accObj1.accountBalance=50505050;
		accObj1.deposit(50001);
		accObj1.showAccount();
	}
}
//Vishal is a developer
//ENDUSER: jack is a farmer who has this account in the bank

class Account {

	private int accountNumber;
	 private String accountHolderName;
	 private double accountBalance;
	
	Account(int x, String y, double z) {
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
	

	double deposit( double amountToDeposit) {
		if(amountToDeposit > 50000) {
			System.out.println("Show the PAN");
		}
		else {
			System.out.println(accountHolderName+" is Depositing..."+amountToDeposit);
			accountBalance  = accountBalance + amountToDeposit;
		}
		return accountBalance;
	}
}

// http://ip:port/App/depositHere/123/5000