package pack.cap.module.mod4;

// Generalization
class BankAccount{
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited successfully: "+amount+"New Balance: "+ balance);
		}
		else {
			System.out.println("deposit amount must be positive.");
		}
	}
	
	public void withDraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw successfull: "+amount+"New Balance: "+ balance);
		}
		else {
			System.out.println("insuffucient balance");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance for account "+accountNumber+" $ "+balance);
	}
}


// Specialization
class SavingsAccount extends BankAccount{
	double intRate;
	public SavingsAccount(String accountNumber, double balance, double intRate) {
		super(accountNumber, balance);
		this.intRate = intRate;
	}
	
	public void applyInterest() {
		double intr = balance * intRate;
		balance += intr;
		System.out.println("Interest of $ "+intr+" applied New balance "+balance);
	}
}

class CheckingAccount extends BankAccount{
	double fee;
	public CheckingAccount(String accountNumber, double balance, double fee) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.fee = fee;
	}
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			balance -= fee;
			System.out.println("Withdraw "+amount+" with fee of "+fee);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	
}

class BusinessAccount extends BankAccount {
 double overdraftLimit;

 public BusinessAccount(String accountNumber, double balance, double overdraftLimit) {
     super(accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withDraw(double amount) {
     if (amount > 0 && (balance + overdraftLimit) >= amount) {
         balance -= amount;
         System.out.println("Withdraw successful: " + amount + " New Balance: " + balance);
     } else {
         System.out.println("Insufficient balance and overdraft limit exceeded");
     }
 }
}


class SIP extends BankAccount{
 double investmentAmount;
 double totalInvested;

 public SIP(String accountNumber, double balance, double investmentAmount) {
	 super(accountNumber, balance);
	 this.investmentAmount = investmentAmount;
     this.totalInvested = 0;
 }

 public void invest() {
     totalInvested += investmentAmount;
     System.out.println("Invested $ " + investmentAmount + " in SIP. Total Invested: $ " + totalInvested);
 }
}


class TradingAccount extends BankAccount {
 double transactionFee;

 public TradingAccount(String accountNumber, double balance, double transactionFee) {
     super(accountNumber, balance);
     this.transactionFee = transactionFee;
 }

 public void trade(double amount) {
     if (amount > 0 && amount + transactionFee <= balance) {
         balance -= (amount + transactionFee);
         System.out.println("Traded $ " + amount + " with a transaction fee of $ " + transactionFee + ". New Balance: " + balance);
     } else {
         System.out.println("Insufficient balance for trading");
     }
 }

}

public class GenlnSpeclnDemo {

	public static void main(String[] args) {
	
		SavingsAccount sa = new SavingsAccount("SA123", 5000, 0.03);
        sa.deposit(10000);
        sa.applyInterest(); // specialization

        CheckingAccount ca = new CheckingAccount("CA456", 4000, 2.5);
        ca.deposit(1000);
        ca.withDraw(200); // specialization withdraw a fee.

        BusinessAccount ba = new BusinessAccount("BA789", 3000, 1000);
        ba.withDraw(3500); // should succeed due to overdraft limit

        SIP sip = new SIP("SA123", 5000,500);
        sip.invest(); // investing in SIP

        TradingAccount ta = new TradingAccount("TA101", 2000, 15);
        ta.trade(500); // trading with a transaction fee
        ta.checkBalance(); // check balance after trading
	
	}

}
