
package pack.capg.module.collections2;

public class BankAccount implements Comparable<BankAccount> {

	private int accNum;
	private String name;
	private double bal;
	public BankAccount(int accNum, String name, double bal) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.bal = bal;
	}
	
	public double getBal() {
		return bal;
	}
	
	public String getName() {
		return name;
	}
	
	public int getaccNum() {
		return accNum;
	}
	
	public double deposit(double amt) {
		return bal=bal+amt;
	}
	
	public double withdraw(double amt) {
		if(bal > amt) {
			bal=bal-amt;
		}else {
			System.out.println("Insufficient balance...");
		}
		return bal;
	}
	
	public double checkbal(int acc) {
		return this.bal;
	}
	
	public void removeAcc(int acc) {
		
		System.out.println("Account removed");
	}
	
	@Override
	public String toString() {
		return "Bank [Account Number="+accNum+" , name= "+name+", balance= "+bal+ "]";
	}

	@Override
	public int compareTo(BankAccount o) {
		// TODO Auto-generated method stub
		return Double.compare(this.bal,  o.bal); // compare by studentid
	}
	

}

